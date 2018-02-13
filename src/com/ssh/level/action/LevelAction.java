package com.ssh.level.action;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.course.domain.Course;
import com.ssh.course.service.CourseService;
import com.ssh.level.domain.Level;
import com.ssh.level.service.LevelService;
import com.ssh.term.domain.Term;
import com.ssh.term.service.TermService;
import com.ssh.utils.CopyImage;
import com.ssh.utils.ImageUploadSource;
import com.ssh.utils.PageBean;
import com.ssh.utils.UploadImage;

public class LevelAction extends ActionSupport implements ModelDriven<Level> {

	private static final long serialVersionUID = 1L;
	private Level level = new Level();
	
	@Override
	public Level getModel() {
		return level;
	}
	
	private LevelService levelService;
	public void setLevelService(LevelService levelService) {
		this.levelService = levelService;
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

	//����currentPage
    private int currentPage;
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String findLevelListByPage(){	 
		 //��ҳ����pageBean
//	    PageBean<Level> pageBean = levelService.findLevelListByPage(currentPage);
// 
//	    ActionContext.getContext().getValueStack().set("pageBean", pageBean);
//		return "levelList";	
		
		 PageBean<Course> pageBean = courseService.findCourseListByPage(currentPage);
		  
		 ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		 return "courseList2";	
		
	}

	public String findLevelListByCourseId(){	 
		
	    List<Level> levelList = levelService.findLevelListByCourseId(CourseId);	    
	    ActionContext.getContext().getValueStack().set("levelList", levelList);	
	    ServletActionContext.getRequest().getSession().setAttribute("CourseId", CourseId);
	    
	    PageBean<Level> pageBean = levelService.findLevelListByPage(currentPage);
		  
		 ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "levelList";	
	}
	
	public String addLevel() throws IOException{
		int courseid = (int)ActionContext.getContext().getSession().get("CourseId");
		Course course = courseService.findCourseById(courseid);
		
		File srcFile = level.getUpload();
		String path = ServletActionContext.getServletContext().getRealPath(level.getSavePath());
		File file = new File(path);
		if(!file.exists()){
			file.mkdir();
		}
            String dstPath = path + "\\"+level.getUploadFileName();  
            File dstFile = new File(dstPath);  
            new CopyImage().copy(srcFile, dstFile);
            String oldName = level.getUploadFileName();
            String suffix = oldName.substring(oldName.lastIndexOf("."));
//            System.out.println(ImageUploadSource.CURRICULUM_IMAGE.getPrefix());
			String image = new UploadImage().upload(ImageUploadSource.CURRICULUM_IMAGE.getPrefix(), dstPath, suffix);
			
			level.setImage(image);
		
		level.setCourse(course);
		levelService.addLevel(level);	
		List<Level> levelList = levelService.findLevelListByCourseId(CourseId);	    
		ActionContext.getContext().getValueStack().set("levelList", levelList);
		return "levelList";
		
	}
	

	
	 public String edit()
	  {
	    level = levelService.findLevelById(level.getLevelId());
	    HttpServletRequest request = ServletActionContext.getRequest();
	    request.setAttribute("levelValid", level.getValid());
	    return "edit";
	  }
	
	 
	 public String update()
	  {
	    levelService.update(level);
	    List<Level> levelList = levelService.findLevelListByCourseId(CourseId);	    
		ActionContext.getContext().getValueStack().set("levelList", levelList);
		return "levelList";
	  }
	
	 
	public String delete()
	  {
		
	    Level existLevel = levelService.findLevelById(level.getLevelId());
	    levelService.delete(existLevel);
	    
	    List<Level> levelList = levelService.findLevelListByCourseId(CourseId);	    
		ActionContext.getContext().getValueStack().set("levelList", levelList);
		return "levelList";
		
	  }
}
