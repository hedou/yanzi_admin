package com.ssh.influence.dao.impl;

import java.util.List;

import org.hibernate.FlushMode;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.course.domain.Course;
import com.ssh.influence.dao.InfluenceDao;
import com.ssh.influence.domain.Influence;
import com.ssh.level.domain.Level;
import com.ssh.utils.PageHibernateCallback;

public class InfluenceDaoImpl extends HibernateDaoSupport implements InfluenceDao{

	@Override
	public void addInfluence(Influence influence) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
		this.getHibernateTemplate().save(influence);
	}

	@Override
	public void update(Influence influence) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(influence);
	}

	@Override
	public void delete(Influence existInfluence) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(existInfluence);
	}

	@Override
	public int findInfluenceCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Influence";
		List<Long> count = (List<Long>) this.getHibernateTemplate().find(hql);
		if (count!=null&& count.size()>0) {
			return count.get(0).intValue();
		}
		return 0 ;
	}

	@Override
	public void add(Influence influence) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(influence);
	}

	@Override
	public List<Influence> findInfluenceListByPage(int begin, int pageSize) {
		// TODO Auto-generated method stub
		String hql = "from Influence";
	    List<Influence> list = (List)getHibernateTemplate().execute(
	      new PageHibernateCallback(hql, null, begin, 
	      pageSize));
	    return list;
	}

	@Override
	public Influence findInfluenceById(Integer influenceId) {
		// TODO Auto-generated method stub
		List<Influence> list = (List<Influence>) this.getHibernateTemplate().find("from Influence where InfluenceId = ?", influenceId);
		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

}
