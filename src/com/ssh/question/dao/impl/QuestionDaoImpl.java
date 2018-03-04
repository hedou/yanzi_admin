package com.ssh.question.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.opensymphony.xwork2.ActionContext;
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

	@Override
	public int findQuestionMaxIndex(int lessonId) {
		int LessonId = (int)ActionContext.getContext().getSession().get("LessonId");
		System.out.println(LessonId);
		Session session = this.getSessionFactory().getCurrentSession();
		
		String sql = "select max(t_Index) from Question where LessonId = ?";
		Integer index = (Integer)session.createSQLQuery(sql).setParameter(0, LessonId).uniqueResult();
		 
		return index.intValue();
	}

	

	
	
	

}
