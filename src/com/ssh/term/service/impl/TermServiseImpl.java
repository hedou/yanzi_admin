package com.ssh.term.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.term.dao.TermDao;
import com.ssh.term.domain.Term;
import com.ssh.term.service.TermService;

@Transactional
public class TermServiseImpl implements TermService {

	private TermDao termDao;
	public void setTermDao(TermDao termDao) {
		this.termDao = termDao;
	}

	@Override
	public List<Term> findTermListByCourseId(int courseId) {
		
		return termDao.findTermListByCourseId(courseId);
	}

}
