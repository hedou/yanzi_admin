package com.ssh.question.domain;

import java.io.File;
import java.sql.Timestamp;

import com.ssh.lesson.domain.Lesson;

public class QuestionImage {
	 private String imageTitle;

	 private File imageContent;

	 private String savePath;
	 
	private String uploadFileName;
	
	private String uploadContentType;
	public String getImageTitle() {
		return imageTitle;
	}

	public void setImageTitle(String imageTitle) {
		this.imageTitle = imageTitle;
	}

	public File getImageContent() {
		return imageContent;
	}

	public void setImageContent(File imageContent) {
		this.imageContent = imageContent;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	 
	 
}
