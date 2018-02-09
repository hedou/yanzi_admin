package com.ssh.question.dao;

import java.util.List;

import com.ssh.question.domain.Question;

public interface QuestionDao {

	List<Question> findQuestionListByLessonId(int lessonId);

	void addQuestion(Question question);

	Question findQuestionById(Integer questionId);

	void update(Question question);

	void delete(Question existquestion);

}
