package com.ssh.level.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.level.dao.LevelDao;
import com.ssh.level.domain.Level;
import com.ssh.level.service.LevelService;
import com.ssh.term.dao.TermDao;
@Transactional
public class LevelServiceImpl implements LevelService {

	private LevelDao levelDao;

	public void setLevelDao(LevelDao levelDao) {
		this.levelDao = levelDao;
	}

}
