package com.ssh.level.domain;

import java.sql.Timestamp;

import com.ssh.course.domain.Course;

public class Level {
	
	private Integer LevelId;
	
	private Course course;
	private Integer Level;
	private String Image;
	private Integer MinExp;
	private Integer Coin;
	private Integer Valid;
	private Timestamp AddTime;
	private Timestamp UpdateTime;
	

	
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
