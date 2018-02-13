package com.ssh.question.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.lesson.domain.Lesson;
import com.ssh.lesson.service.LessonService;
import com.ssh.question.domain.Question;
import com.ssh.question.service.QuestionService;

public class QuestionAction extends ActionSupport implements ModelDriven<Question>{

	private Question question = new Question();
	public Question getModel() {
		return question;
	}
	
	private QuestionService questionService;
	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	
	private LessonService lessonService;
	public void setLessonService(LessonService lessonService) {
		this.lessonService = lessonService;
	}
	
	private int LessonId;
	public void setLessonId(int lessonId) {
		LessonId = lessonId;
	}

	public String findQuestionListByLessonId(){
		
		List<Question> questions =  questionService.findQuestionListByLessonId(LessonId);
		ActionContext.getContext().getValueStack().set("questionList", questions);	
		
		ServletActionContext.getRequest().getSession().setAttribute("LessonId",LessonId);
		
		return "questionList";
	}
	
	public String addQuestion(){
		
		int LessonId = (int)ActionContext.getContext().getSession().get("LessonId");	
		Lesson lesson = lessonService.findLessonById(LessonId);
		question.setLesson(lesson);	
		questionService.addQuestion(question);
		
		List<Question>  questions =  questionService.findQuestionListByLessonId(LessonId);
		ActionContext.getContext().getValueStack().set("questionList",questions);
		
		return "questionList";
	}
	
	
	
	
	
	
	 public String edit()
	  {
		 
		question = questionService.findQuestionById(question.getQuestionId());
		HttpServletRequest request = ServletActionContext.getRequest();
	    request.setAttribute("questionValid", question.getValid());
	    return "edit";
	  }
	
	 
	 public String update()
	  {
	    questionService.update(question);
	    
	    List<Question> questionList = questionService.findQuestionListByLessonId(LessonId);  
		ActionContext.getContext().getValueStack().set("questionList", questionList);
		
		return "questionList";
	  }
	
	 
	public String delete()
	  {
		
	    Question existquestion = questionService.findQuestionById(question.getQuestionId());
	    questionService.delete(existquestion);
	    
	    List<Question> questionList = questionService.findQuestionListByLessonId(LessonId);      
		ActionContext.getContext().getValueStack().set("questionList", questionList);
		return "questionList";
		
	  }
	
	
	
	
	
	
	
	
}
