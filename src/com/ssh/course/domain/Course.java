package com.ssh.course.domain;

import java.sql.Date;


public class Course {
	
	private Integer Id;
	private String Title;
	private String EnTitle;
	private String Image;
	private Integer Valid;
	private Date AddTime;
	private Date UpdateTime;
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
