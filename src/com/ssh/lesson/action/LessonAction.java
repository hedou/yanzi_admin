package com.ssh.lesson.action;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
		
		File[] srcFile = lesson.getUpload();//鍖呭惈鍏冲崱绠�鍥撅紝鍏冲崱灏侀潰鍥撅紝鍏冲崱鎬荤粨鑳屾櫙鍥�
		String[] fileName = lesson.getUploadFileName();
		String path = ServletActionContext.getServletContext().getRealPath(lesson.getSavePath());
		File file = new File(path);
		if(!file.exists()){
			file.mkdir();
		}
		String[] serverImgPath = {ImageUploadSource.LESSON_IMAGE.getPrefix(),
								ImageUploadSource.LESSON_BACKGROUD_IMAGE.getPrefix(),
								ImageUploadSource.QUESTION_ANALYSIS_IMAGE.getPrefix()};
		CopyImage copy = new CopyImage();
		UploadImage upload = new UploadImage();
		String dstPath = null;
		for(int i=0;i<srcFile.length;i++){
			dstPath = path + "\\"+fileName[i];  
            File dstFile = new File(dstPath);  
            copy.copy(srcFile[i], dstFile);
            String oldName = fileName[i];
            String suffix = oldName.substring(oldName.lastIndexOf("."));
//            System.out.println(ImageUploadSource.CURRICULUM_IMAGE.getPrefix());
			String message = upload.upload(serverImgPath[i], dstPath, suffix);
			
			if(i == 0){
				lesson.setImage(message);
			}else if(i == 1){
				lesson.setPrimerImage(message);
			}else if(i == 2){
				lesson.setSummaryImage(message);
			}
		}
		
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
		 
		 System.out.println(lesson.getStartTime()+"==============================================================");
		
		 
		lesson.setStartTime(lesson.getStartTime());
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
