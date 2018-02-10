package com.ssh.lesson.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.course.domain.Course;
import com.ssh.lesson.dao.LessonDao;
import com.ssh.lesson.domain.Lesson;
import com.ssh.lesson.service.LessonService;
import com.ssh.utils.PageBean;

@Transactional
public class LessonServiceImpl implements LessonService {

	private LessonDao lessonDao;
	
	
	public void setLessonDao(LessonDao lessonDao) {
		this.lessonDao = lessonDao;
	}


	@Override
	public List<Lesson> findLessonListByTermId(Integer t_id) {
	
		return lessonDao.findLessonListByTermId(t_id);
	}


	@Override
	public void addLesson(Lesson lesson) {
		lessonDao.addLesson(lesson);
		
	}


	@Override
	public Lesson findLessonById(int lessonId) {
		return lessonDao.findLessonById(lessonId);
	}


	@Override
	public void delete(Lesson existlesson) {
		lessonDao.delete(existlesson);
		
	}


	@Override
	public void update(Lesson lesson) {
		lessonDao.update(lesson);
		
	}

}
