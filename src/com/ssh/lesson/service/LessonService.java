package com.ssh.lesson.service;

import java.util.List;

import com.ssh.lesson.domain.Lesson;
import com.ssh.utils.PageBean;

public interface LessonService {

	List<Lesson> findLessonListByTermId(Integer t_id);

	void addLesson(Lesson lesson);

	Lesson findLessonById(int lessonId);

	void delete(Lesson existlesson);

	void update(Lesson lesson);



}
