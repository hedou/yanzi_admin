package com.ssh.term.service;

import java.util.List;

import com.ssh.term.domain.Term;

public interface TermService {

	List<Term> findTermListByCourseId(int courseId);



}
