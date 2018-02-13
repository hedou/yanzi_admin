package com.ssh.question.domain;

import java.io.File;
import java.sql.Timestamp;

import com.ssh.lesson.domain.Lesson;

public class Question {
	private Integer QuestionId;
	private String JsonContent;
	private Integer Valid;
	private Lesson lesson;
	private Integer Index;
	private Integer CorrectId;	
	private Timestamp AddTime;
	private Integer Type;

	
	public Integer getType() {
		return Type;
	}
	public void setType(Integer type) {
		Type = type;
	}
	public Timestamp getAddTime() {
		return AddTime;
	}
	public void setAddTime(Timestamp addTime) {
		AddTime = addTime;
	}
	public Timestamp getUpdateTime() {
		return UpdateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		UpdateTime = updateTime;
	}
	private Timestamp UpdateTime;
	

	public Integer getCorrectId() {
		return CorrectId;
	}
	public void setCorrectId(Integer correctId) {
		CorrectId = correctId;
	}
	public Integer getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(Integer questionId) {
		QuestionId = questionId;
	}
	public String getJsonContent() {
		return JsonContent;
	}
	public void setJsonContent(String jsonContent) {
		JsonContent = jsonContent;
	}
	public Integer getValid() {
		return Valid;
	}
	public void setValid(Integer valid) {
		Valid = valid;
	}
	public Lesson getLesson() {
		return lesson;
	}
	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
	public Integer getIndex() {
		return Index;
	}
	public void setIndex(Integer index) {
		Index = index;
	}

	
}
