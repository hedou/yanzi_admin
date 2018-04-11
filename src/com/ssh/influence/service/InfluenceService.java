package com.ssh.influence.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.influence.domain.Influence;
import com.ssh.level.domain.Level;
import com.ssh.utils.PageBean;
@Transactional
public interface InfluenceService {
	
//	List<Level> findLevelListByCourseId(int courseId);

	void addInfluence(Influence influence);

//	Level findLevelById(Integer levelId);

	void update(Influence influence);

	void delete(Influence existInfluence);

	PageBean<Influence> findInfluenceListByPage(int currentPage);

	void add(Influence influence);

	Influence findInfluenceById(Integer influenceId);
}
