package com.ssh.course.action;

import java.io.File;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.course.domain.Course;
import com.ssh.course.service.CourseService;
import com.ssh.utils.CopyImage;
import com.ssh.utils.ImageUploadSource;
import com.ssh.utils.PageBean;
import com.ssh.utils.UploadImage;

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
	    return "edit";
	  }
	 
	 
	public String update()
	  {
	    courseService.update(course);
	    return "updateSuccess";
	  }
	
	public String add() throws Exception{
		File srcFile = course.getUpload();
		String path = ServletActionContext.getServletContext().getRealPath(course.getSavePath());
		File file = new File(path);
		if(!file.exists()){
			file.mkdir();
		}
            String dstPath = path + "\\"+course.getUploadFileName();  
            File dstFile = new File(dstPath);  
            new CopyImage().copy(srcFile, dstFile);
            String oldName = course.getUploadFileName();
            String suffix = oldName.substring(oldName.lastIndexOf("."));
//            System.out.println(ImageUploadSource.CURRICULUM_IMAGE.getPrefix());
			String image = new UploadImage().upload(ImageUploadSource.CURRICULUM_IMAGE.getPrefix(), dstPath, suffix);
			
			course.setImage(image);
			courseService.add(course);
			return "addSuccess";
	}
	
	
}
