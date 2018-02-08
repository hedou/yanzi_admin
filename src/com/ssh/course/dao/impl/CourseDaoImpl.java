package com.ssh.course.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.course.dao.CourseDao;
import com.ssh.course.domain.Course;

import com.ssh.utils.PageHibernateCallback;

public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {

	@Override
	public List<Course> findCourseListByPage(int begin, int pageSize) {
		 String hql = "from Course";
		    List<Course> list = (List)getHibernateTemplate().execute(
		      new PageHibernateCallback(hql, null, begin, 
		      pageSize));
		    return list;
	}

	@Override
	public int findNewsCount() {
		String hql = "select count(*) from Course";
		List<Long> count = (List<Long>) this.getHibernateTemplate().find(hql);
		if (count!=null&& count.size()>0) {
			return count.get(0).intValue();
		}
		return 0 ;
	}


}
