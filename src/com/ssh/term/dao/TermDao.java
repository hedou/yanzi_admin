package com.ssh.term.dao;

import java.util.List;

import com.ssh.term.domain.Term;

public interface TermDao {

	List<Term> findTermListByCourseId(int courseId);



}
