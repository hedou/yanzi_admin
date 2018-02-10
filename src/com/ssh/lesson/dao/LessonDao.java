package com.ssh.lesson.dao;

import java.util.List;

import com.ssh.lesson.domain.Lesson;

public interface LessonDao {


	List<Lesson> findLessonListByTermId(Integer t_id);

	void addLesson(Lesson lesson);

	Lesson findLessonById(int lessonId);

	void delete(Lesson existlesson);

	void update(Lesson lesson);

}
