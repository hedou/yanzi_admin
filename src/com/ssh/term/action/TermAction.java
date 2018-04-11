package com.ssh.term.action;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.course.domain.Course;
import com.ssh.course.service.CourseService;
import com.ssh.term.domain.Term;
import com.ssh.term.service.TermService;
import com.ssh.utils.CopyImage;
import com.ssh.utils.ImageUploadSource;
import com.ssh.utils.UploadImage;


public class TermAction extends ActionSupport implements ModelDriven<Term> {

	private static final long serialVersionUID = 1L;
	private Term term = new Term();
	
	@Override
	public Term getModel() {
		return term;
	}
	
	private TermService termService;
	public void setTermService(TermService termService) {
		this.termService = termService;
	}
	
	private CourseService courseService;
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	//����courseId
	private int CourseId;
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}



	public String findTermListByCourseId(){	 
		
	    List<Term> termList = termService.findTermListByCourseId(CourseId);	    
	    ActionContext.getContext().getValueStack().set("termList", termList);	
	    ServletActionContext.getRequest().getSession().setAttribute("CourseId", CourseId);	
		return "termList";	
	}
	
	public String addTerm() throws IOException{
		int courseid = (int)ActionContext.getContext().getSession().get("CourseId");
		Course course = courseService.findCourseById(courseid);//1520391469000
		
		File[] srcFile = term.getUpload();
		String[] fileName = term.getUploadFileName();
		String path = ServletActionContext.getServletContext().getRealPath(term.getSavePath());
		File file = new File(path);
		if(!file.exists()){
			file.mkdir();
		}

			
			
			
			
			        String[] serverImgPath = {ImageUploadSource.TERM_IMAGE.getPrefix(),
			        							ImageUploadSource.TERM_IMAGE2.getPrefix()};
					CopyImage copy = new CopyImage();
					UploadImage upload = new UploadImage();
					String dstPath = null;
					for(int i=0;i<srcFile.length;i++){
						dstPath = path + "\\"+fileName[i];  
						File dstFile = new File(dstPath);  
						copy.copy(srcFile[i], dstFile);
						String oldName = fileName[i];
						String suffix = oldName.substring(oldName.lastIndexOf("."));
						//System.out.println(ImageUploadSource.CURRICULUM_IMAGE.getPrefix());
						String message = upload.upload(serverImgPath[i], dstPath, suffix);
						
						if(i == 0){
							term.setImage(message);
						}else if(i == 1){
							term.setImage2(message);
						}
					}
			
			
			
			
			
		
		term.setCourse(course);
		termService.addTerm(term);	
		List<Term> termList = termService.findTermListByCourseId(CourseId);	    
		ActionContext.getContext().getValueStack().set("termList", termList);
		return "termList";
		
	}
	
	 public String edit()
	  {
	    term = termService.findTermById(term.getT_Id());
	    HttpServletRequest request = ServletActionContext.getRequest();
	    request.setAttribute("termValid", term.getValid());
	    return "edit";
	  }
	
	 
	 public String update()
	  {
	    termService.update(term);
	    List<Term> termList = termService.findTermListByCourseId(CourseId);	    
		ActionContext.getContext().getValueStack().set("termList", termList);
		return "termList";
	  }
	
	 
	public String delete()
	  {
		
	    Term existTerm = termService.findTermById(term.getT_Id());
	    termService.delete(existTerm);
	    
	    List<Term> termList = termService.findTermListByCourseId(CourseId);	    
		ActionContext.getContext().getValueStack().set("termList", termList);
		return "termList";
		
	  }
	 

}
