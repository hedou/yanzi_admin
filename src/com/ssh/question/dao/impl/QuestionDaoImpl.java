package com.ssh.question.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.lesson.domain.Lesson;
import com.ssh.question.dao.QuestionDao;
import com.ssh.question.domain.Question;

public class QuestionDaoImpl extends HibernateDaoSupport  implements QuestionDao {

	@Override
	public List<Question> findQuestionListByLessonId(int lessonId) {
		
		String hql = "from Question where LessonId = ?";
		List<Question> list = (List<Question>) this.getHibernateTemplate().find(hql, lessonId);

		if (list!=null && list.size()>0) {
			return list;
		}
		return null;
	}

	@Override
	public void addQuestion(Question question) {
		this.getHibernateTemplate().save(question);
		
	}

	@Override
	public Question findQuestionById(Integer questionId) {
	List<Question> list = (List<Question>) this.getHibernateTemplate().find("from Question where QuestionId = ?", questionId);
		
		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Question question) {
		this.getHibernateTemplate().update(question);
		
	}

	@Override
	public void delete(Question existquestion) {
		this.getHibernateTemplate().delete(existquestion);
		
	}
	
	

}
