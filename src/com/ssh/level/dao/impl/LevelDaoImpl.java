package com.ssh.level.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.course.domain.Course;
import com.ssh.level.dao.LevelDao;
import com.ssh.level.domain.Level;
import com.ssh.question.domain.Question;
import com.ssh.term.domain.Term;
import com.ssh.utils.PageHibernateCallback;

public class LevelDaoImpl extends HibernateDaoSupport implements LevelDao{
	
	@Override
	public List<Level> findLevelListByCourseId(int courseId) {
		// TODO Auto-generated method stub
		String hql = "from Level where CourseId = ?";
		List<Level> list = (List<Level>) this.getHibernateTemplate().find(hql, courseId);

		if (list!=null && list.size()>0) {
			return list;
		}
		return null;
	}

	@Override
	public void addLevel(Level level) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(level);
	}

	@Override
	public Level findLevelById(Integer levelId) {
		// TODO Auto-generated method stub
		String hql = "from Level where LevelId = ?";
		List<Level> list = (List<Level>) this.getHibernateTemplate().find(hql, levelId);

		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Level level) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(level);
	}

	@Override
	public void delete(Level existLevel) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(existLevel);
	}

	@Override
	public int findLevelCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Level";
		List<Long> count = (List<Long>) this.getHibernateTemplate().find(hql);
		if (count!=null&& count.size()>0) {
			return count.get(0).intValue();
		}
		return 0 ;
	}

	@Override
	public List<Level> findLevelListByPage(int begin, int pageSize) {
		String hql = "from Level";
	    List<Level> list = (List)getHibernateTemplate().execute(
	      new PageHibernateCallback(hql, null, begin, 
	      pageSize));
	    return list;
	}

	@Override
	public void add(Level level) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(level);
	}
	
}
