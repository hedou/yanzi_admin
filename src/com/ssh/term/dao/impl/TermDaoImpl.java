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

	@Override
	public void addTerm(Term term) {
		this.getHibernateTemplate().save(term);
		
	}

	@Override
	public Term findTermById(Integer t_id) {
		
		String hql = "from Term where t_id = ?";
		List<Term> list = (List<Term>) this.getHibernateTemplate().find(hql, t_id);

		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Term term) {
		this.getHibernateTemplate().update(term);
		
	}

	@Override
	public void delete(Term existTerm) {
		this.getHibernateTemplate().delete(existTerm);
		
	}

}
