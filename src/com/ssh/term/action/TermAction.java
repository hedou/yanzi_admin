package com.ssh.term.action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.course.domain.Course;
import com.ssh.course.service.CourseService;
import com.ssh.term.domain.Term;
import com.ssh.term.service.TermService;


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

	//Ω” ’courseId
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
	
	public String addTerm(){
		int courseid = (int)ActionContext.getContext().getSession().get("CourseId");
		Course course = courseService.findCourseById(courseid);
		term.setCourse(course);
		termService.addTerm(term);	
		List<Term> termList = termService.findTermListByCourseId(CourseId);	    
		ActionContext.getContext().getValueStack().set("termList", termList);
		return "termList";
		
	}
	
	 public String edit()
	  {
	    term = termService.findTermById(term.getT_Id());
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
