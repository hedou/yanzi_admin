package com.ssh.course.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

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
		return course;
	}
	
	private CourseService courseService;
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	//����currentPage
    private int currentPage;
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public String findCourseListByPage(){	 
		 //��ҳ����pageBean
	    PageBean<Course> pageBean = courseService.findCourseListByPage(currentPage);
  
	    ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "courseList";	
	}

	public String delete()
	  {
	    Course existCourse = courseService.findCourseById(course.getCourseId());
	    courseService.delete(existCourse);
	    return "deleteSuccess";
	  }
	
	 public String edit()
	  {
	    course = courseService.findCourseById(course.getCourseId());
	    HttpServletRequest request = ServletActionContext.getRequest();
	    request.setAttribute("courseValid", course.getValid());
	    return "edit";
	  }
	 
	 
	public String update()
	  {
	    courseService.update(course);
	    return "updateSuccess";
	  }
	
	public String add(){
		
		courseService.add(course);
		return "addSuccess";
	}
	
	
}
