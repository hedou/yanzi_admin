package com.ssh.question.service;

import java.util.List;

import com.ssh.question.domain.Question;

public interface QuestionService {

	List<Question> findQuestionListByLessonId(int lessonId);

	void addQuestion(Question question);

	Question findQuestionById(Integer questionId);

	void update(Question question);

	void delete(Question existquestion);

}
