package com.ssh.lesson.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.lesson.dao.LessonDao;
import com.ssh.lesson.domain.Lesson;
import com.ssh.term.domain.Term;
import com.ssh.term.service.TermService;

public class LessonDaoImpl extends HibernateDaoSupport implements LessonDao {

	private TermService termService;	
	public void setTermService(TermService termService) {
		this.termService = termService;
	}

	@Override
	public List<Lesson> findLessonListByTermId(Integer t_id) {
	
		Term term = termService.findTermById(t_id);
		
		List<Lesson> list = (List<Lesson>) this.getHibernateTemplate().find("from Lesson  where term = ? order by Index asc", term);
		if (list!=null && list.size()>0) {
			return list;
		}
		return null;
	}

	@Override
	public void addLesson(Lesson lesson) {
		this.getHibernateTemplate().save(lesson);
		
	}

	@Override
	public Lesson findLessonById(int lessonId) {
		
		List<Lesson> list = (List<Lesson>) this.getHibernateTemplate().find("from Lesson where LessonId = ?", lessonId);
		
		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
		
	}

	@Override
	public void delete(Lesson existlesson) {
		this.getHibernateTemplate().delete(existlesson);
		
	}

	@Override
	public void update(Lesson lesson) {
		this.getHibernateTemplate().update(lesson);
		
	}



		  

}
