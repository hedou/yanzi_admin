package com.ssh.lesson.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.lesson.domain.Lesson;
import com.ssh.lesson.service.LessonService;
import com.ssh.term.domain.Term;
import com.ssh.term.service.TermService;
import com.ssh.utils.CopyImage;
import com.ssh.utils.ImageUploadSource;
import com.ssh.utils.PageBean;
import com.ssh.utils.UploadImage;

public class LessonAction extends ActionSupport implements ModelDriven<Lesson> {

	private static final long serialVersionUID = 1L;
	private Lesson lesson = new Lesson();
	public Lesson getModel() {
		return lesson;
	}
	
	private LessonService lessonService;	
	public void setLessonService(LessonService lessonService) {
		this.lessonService = lessonService;
	}
	
	
	private TermService termService;
	public void setTermService(TermService termService) {
		this.termService = termService;
	}

	private int t_Id;

	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}




	public String findLessonListByTermId(){
	
		
		 List<Lesson> lessons = lessonService.findLessonListByTermId(t_Id);
		
		 ActionContext.getContext().getValueStack().set("lessonList",lessons);
		 
		 ServletActionContext.getRequest().getSession().setAttribute("t_Id", t_Id);
		 
		return "lessonList";
	}
	
	public String addLesson() throws IOException{
		
		int t_Id = (int)ActionContext.getContext().getSession().get("t_Id");
		Term term = termService.findTermById(t_Id);
		
		File srcFile = lesson.getUpload();
		String path = ServletActionContext.getServletContext().getRealPath(lesson.getSavePath());
		File file = new File(path);
		if(!file.exists()){
			file.mkdir();
		}
            String dstPath = path + "\\"+lesson.getUploadFileName();  
            File dstFile = new File(dstPath);  
            new CopyImage().copy(srcFile, dstFile);
            String oldName = lesson.getUploadFileName();
            String suffix = oldName.substring(oldName.lastIndexOf("."));
//            System.out.println(ImageUploadSource.CURRICULUM_IMAGE.getPrefix());
			String image = new UploadImage().upload(ImageUploadSource.CURRICULUM_IMAGE.getPrefix(), dstPath, suffix);
			
			lesson.setImage(image);
		
		lesson.setTerm(term);
		lessonService.addLesson(lesson);
		
		List<Lesson> lesson =  lessonService.findLessonListByTermId(t_Id);
		 ActionContext.getContext().getValueStack().set("lessonList",lesson);
		return "lessonList";
		
	}
	
	
	
	
	 public String edit()
	  {
		 
		lesson = lessonService.findLessonById(lesson.getLessonId());
		HttpServletRequest request = ServletActionContext.getRequest();
	    request.setAttribute("lessonValid", lesson.getValid());
	    return "edit";
	  }
	
	 
	 public String update()
	  {
	    lessonService.update(lesson);
	    
	    List<Lesson> lessonList = lessonService.findLessonListByTermId(t_Id);    
		ActionContext.getContext().getValueStack().set("lessonList", lessonList);
		
		return "lessonList";
	  }
	
	 
	public String delete()
	  {
		
	    Lesson existlesson = lessonService.findLessonById(lesson.getLessonId());
	    lessonService.delete(existlesson);
	    
	    List<Lesson> lessonList = lessonService.findLessonListByTermId(t_Id);	    
		ActionContext.getContext().getValueStack().set("lessonList", lessonList);
		return "lessonList";
		
	  }
	 
	
	
	
	
	
	
	
	
	
}
