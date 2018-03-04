package com.ssh.question.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
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
		int lessonId = (int)ActionContext.getContext().getSession().get("LessonId");	
	    int index2 = questionDao.findQuestionMaxIndex(lessonId);
		question.setIndex(index2+1);
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
//		existquestion.setValid(1);
		questionDao.delete(existquestion);
		
	}
	
	
	

}
