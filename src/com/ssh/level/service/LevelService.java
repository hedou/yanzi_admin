package com.ssh.level.service;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.course.domain.Course;
import com.ssh.level.domain.Level;
import com.ssh.term.domain.Term;
import com.ssh.utils.PageBean;

public interface LevelService {

	List<Level> findLevelListByCourseId(int courseId);

	void addLevel(Level level);

	Level findLevelById(Integer levelId);

	void update(Level level);

	void delete(Level existLevel);

	PageBean<Level> findLevelListByPage(int currentPage);

	void add(Level level);

	

	

	
}
