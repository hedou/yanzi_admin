package com.ssh.level.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.course.service.CourseService;
import com.ssh.level.domain.Level;
import com.ssh.level.service.LevelService;

public class LevelAction extends ActionSupport implements ModelDriven<Level>{

	private static final long serialVersionUID = 1L;
	private Level level = new Level();
	
	@Override
	public Level getModel() {
		return level;
	}
	
	private CourseService courseService;
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	private LevelService levelService;

	public void setLevelService(LevelService levelService) {
		this.levelService = levelService;
	}

	//Ω” ’courseId
	private int CourseId;
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	
	
	
	
	
}
