package com.ssh.influence.dao;

import java.util.List;

import com.ssh.influence.domain.Influence;
import com.ssh.level.domain.Level;

public interface InfluenceDao {
//	List<Level> findLevelListByCourseId(int courseId);

	void addInfluence(Influence influence);

//	Level findLevelById(Integer levelId);

	void update(Influence influence);

	void delete(Influence existInfluence);

	int findInfluenceCount();

//	List<Influence> findLevelListByPage(int begin, int pageSize);

	void add(Influence influence);

	List<Influence> findInfluenceListByPage(int begin, int pageSize);

	Influence findInfluenceById(Integer influenceId);
}
