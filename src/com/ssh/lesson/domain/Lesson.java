package com.ssh.lesson.domain;

import java.io.File;
import java.sql.Timestamp;

import com.ssh.term.domain.Term;

public class Lesson {
	
	private Integer LessonId;
	
	private Term term;
	
	private String Title;
	private String Image;
	private Integer Index;
	private String PrimerTitle;
	private String PrimerBrief;
	private String PrimerImage;
	private String PrimerContent;
	private String SummaryImage;
	private String SummaryContent;
	
	
	private File[] upload;
	private String[] uploadFileName;
	private String[] uploadContentType;
    private String savePath;  
	
	
	private Integer Valid;
	private Timestamp AddTime;
	private Timestamp UpdateTime;
	private Timestamp StartTime;
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public String getSummaryContent() {
		return SummaryContent;
	}
	public void setSummaryContent(String summaryContent) {
		SummaryContent = summaryContent;
	}
	public Integer getLessonId() {
		return LessonId;
	}
	public void setLessonId(Integer lessonId) {
		LessonId = lessonId;
	}
	public Term getTerm() {
		return term;
	}
	public void setTerm(Term term) {
		this.term = term;
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
	public Timestamp getStartTime() {
		return StartTime;
	}
	public void setStartTime(Timestamp startTime) {
		StartTime = startTime;
	}
	public File[] getUpload() {
		return upload;
	}
	public void setUpload(File[] upload) {
		this.upload = upload;
	}
	public String[] getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String[] getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}


	
}
