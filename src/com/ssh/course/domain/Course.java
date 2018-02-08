package com.ssh.course.domain;

import java.sql.Timestamp;


public class Course {
	
	private Integer Id;
	private String Title;
	private String EnTitle;
	private String Image;
	private Integer Valid;
	private Timestamp AddTime;
	private Timestamp UpdateTime;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}

	public String getEnTitle() {
		return EnTitle;
	}
	public void setEnTitle(String enTitle) {
		EnTitle = enTitle;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
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
