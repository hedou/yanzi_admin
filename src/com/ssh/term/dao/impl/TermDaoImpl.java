package com.ssh.term.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.term.dao.TermDao;
import com.ssh.term.domain.Term;

public class TermDaoImpl extends HibernateDaoSupport implements TermDao {

	@Override
	public List<Term> findTermListByCourseId(int courseId) {
		
		String hql = "from Term where CourseId = ?";
		List<Term> list = (List<Term>) this.getHibernateTemplate().find(hql, courseId);

		if (list!=null && list.size()>0) {
			return list;
		}
		return null;
	}

}
