package com.ssh.level.dao;

import java.util.List;

import com.ssh.level.domain.Level;

public interface LevelDao {

	List<Level> findLevelListByCourseId(int courseId);

	void addLevel(Level level);

	Level findLevelById(Integer levelId);

	void update(Level level);

	void delete(Level existLevel);

	int findLevelCount();

	List<Level> findLevelListByPage(int begin, int pageSize);

	void add(Level level);

	
}
