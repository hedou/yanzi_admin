package com.ssh.course.action;

import com.opensymphony.xwork2.ActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.course.domain.Course;
import com.ssh.course.service.CourseService;
import com.ssh.utils.PageBean;

public class CourseAction extends ActionSupport implements ModelDriven<Course> {

	private static final long serialVersionUID = 1L;
	private Course course = new Course();

	public Course getModel() {
		return this.course;
	}
	
	private CourseService courseService;
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	//接收currentPage
    private int currentPage;
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public String findCourseListByPage(){
		 
		 //分页返回pageBean
	    PageBean<Course> pageBean = courseService.findCourseListByPage(currentPage);
  
	    ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "courseList";
		
	}

}
