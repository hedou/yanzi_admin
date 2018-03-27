package com.ssh.level.domain;

import java.io.File;
import java.sql.Timestamp;

import com.ssh.course.domain.Course;

public class Level {
	
	private Integer Deletes;
	
	
	public Integer getDeletes() {
		return Deletes;
	}
	public void setDeletes(Integer deletes) {
		Deletes = deletes;
	}
	private Integer LevelId;
	
	private Course course;
	private Integer Level;
	private String Image;
	private Integer MinExp;
	private Integer Coin;
	private Integer Valid;
	private Timestamp AddTime;
	private Timestamp UpdateTime;
	
	private File upload;
	private String uploadFileName;
	private String uploadContentType;
    private String savePath; 
	
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
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
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public Integer getLevelId() {
		return LevelId;
	}
	public void setLevelId(Integer levelId) {
		LevelId = levelId;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Integer getLevel() {
		return Level;
	}
	public void setLevel(Integer level) {
		Level = level;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	
	public Integer getMinExp() {
		return MinExp;
	}
	public void setMinExp(Integer minExp) {
		MinExp = minExp;
	}
	public Integer getCoin() {
		return Coin;
	}
	public void setCoin(Integer coin) {
		Coin = coin;
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
	
	
}
