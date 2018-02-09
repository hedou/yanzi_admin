package com.ssh.term.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.course.domain.Course;
import com.ssh.term.domain.Term;
import com.ssh.term.service.TermService;
import com.ssh.utils.PageBean;

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
	
	//接收courseId
	private int CourseId;
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}



	public String findTermListByCourseId(){	 
		 //分页返回pageBean
	    List<Term> termList = termService.findTermListByCourseId(CourseId);	    
	    ActionContext.getContext().getValueStack().set("termList", termList);	    
		return "termList";	
	}
	
	public String addTerm(){
		
		
			
		return "addSucess";
	}
	
	
	

}
