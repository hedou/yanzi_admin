package com.ssh.question.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.question.dao.QuestionDao;
import com.ssh.question.domain.Question;
import com.ssh.question.service.QuestionService;

@Transactional
public class QuestionServiceImpl implements QuestionService{
	
	private QuestionDao questionDao;
	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}
	@Override
	public List<Question> findQuestionListByLessonId(int lessonId) {
	
		return questionDao.findQuestionListByLessonId(lessonId);
	}
	@Override
	public void addQuestion(Question question) {
		questionDao.addQuestion(question);
		
	}
	@Override
	public Question findQuestionById(Integer questionId) {
		
		return questionDao.findQuestionById(questionId);
	}
	@Override
	public void update(Question question) {
		questionDao.update(question);
		
	}
	@Override
	public void delete(Question existquestion) {
		existquestion.setValid(1);
		questionDao.update(existquestion);
		
	}
	
	
	

}
