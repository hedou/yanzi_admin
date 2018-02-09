package com.ssh.term.dao;

import java.util.List;

import com.ssh.term.domain.Term;

public interface TermDao {

	List<Term> findTermListByCourseId(int courseId);

	void addTerm(Term term);

	Term findTermById(Integer t_id);

	void update(Term term);

	void delete(Term existTerm);

}
