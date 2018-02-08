package com.ssh.lesson.domain;

import java.sql.Date;

import com.ssh.course.domain.Course;


public class Lesson {
	private Integer Id;
	
	private Course course;
	
	private String Title;
	private String Image;
	private Integer Index;
	private String PrimerTitle;
	private String PrimerBrief;
	private String PrimerImage;
	private String PrimerContent;
	private String SummaryImage;
	private Integer Valid;
	private Date AddTime;
	private Date UpdateTime;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public Integer getIndex() {
		return Index;
	}
	public void setIndex(Integer index) {
		Index = index;
	}
	public String getPrimerTitle() {
		return PrimerTitle;
	}
	public void setPrimerTitle(String primerTitle) {
		PrimerTitle = primerTitle;
	}
	public String getPrimerBrief() {
		return PrimerBrief;
	}
	public void setPrimerBrief(String primerBrief) {
		PrimerBrief = primerBrief;
	}
	public String getPrimerImage() {
		return PrimerImage;
	}
	public void setPrimerImage(String primerImage) {
		PrimerImage = primerImage;
	}
	public String getPrimerContent() {
		return PrimerContent;
	}
	public void setPrimerContent(String primerContent) {
		PrimerContent = primerContent;
	}
	public String getSummaryImage() {
		return SummaryImage;
	}
	public void setSummaryImage(String summaryImage) {
		SummaryImage = summaryImage;
	}
	public Integer getValid() {
		return Valid;
	}
	public void setValid(Integer valid) {
		Valid = valid;
	}
	public Date getAddTime() {
		return AddTime;
	}
	public void setAddTime(Date addTime) {
		AddTime = addTime;
	}
	public Date getUpdateTime() {
		return UpdateTime;
	}
	public void setUpdateTime(Date updateTime) {
		UpdateTime = updateTime;
	}

	
}
