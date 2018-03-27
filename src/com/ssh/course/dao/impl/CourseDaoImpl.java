package com.ssh.course.dao.impl;

import java.util.List;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.course.dao.CourseDao;
import com.ssh.course.domain.Course;

import com.ssh.utils.PageHibernateCallback;

public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {

	@Override
	public List<Course> findCourseListByPage(int begin, int pageSize) {
		 String hql = "from Course where Deletes=0";
		    List<Course> list = (List)getHibernateTemplate().execute(
		      new PageHibernateCallback(hql, null, begin, 
		      pageSize));
		    return list;
	}

	@Override
	public int findCourseCount() {
		String hql = "select count(*) from Course where Deletes=0";
		List<Long> count = (List<Long>) this.getHibernateTemplate().find(hql);
		if (count!=null&& count.size()>0) {
			return count.get(0).intValue();
		}
		return 0 ;
	}

	@Override
	public Course findCourseById(Integer id) {
		List<Course> list = (List<Course>) this.getHibernateTemplate().find("from Course where id = ?", id);
		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void delete(Course existCourse) {
		this.getHibernateTemplate().delete(existCourse);
		
	}

	@Override
	public void update(Course course) {
		this.getHibernateTemplate().update(course);
		
	}

	@Override
	public void add(Course course) {
		this.getHibernateTemplate().save(course);
		
	}


}
