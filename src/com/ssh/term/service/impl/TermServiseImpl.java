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

	@Override
	public void addTerm(Term term) {
		termDao.addTerm(term);
		
	}

	@Override
	public Term findTermById(Integer t_id) {
		return termDao.findTermById(t_id);
	}

	@Override
	public void update(Term term) {
		termDao.update(term);
		
	}

	@Override
	public void delete(Term existTerm) {
		termDao.delete(existTerm);
		
	}

}
