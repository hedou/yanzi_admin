package com.ssh.lesson.action;

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
import com.ssh.utils.PageBean;

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
	
	public String addLesson(){
		
		int t_Id = (int)ActionContext.getContext().getSession().get("t_Id");
		
		Term term = termService.findTermById(t_Id);
		
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
