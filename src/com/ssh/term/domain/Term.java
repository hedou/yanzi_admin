package com.ssh.term.domain;

import java.sql.Timestamp;

import com.ssh.course.domain.Course;

public class Term {
	
	private Integer t_Id;
	private String Title;
	private String Brief;
	private Double Price;
	private Double Discount;
	private String TDesc;
	private String Image;
	private Timestamp StartTime;
	private Timestamp EndTime;
	private Integer Index;
	private Integer Valid;
	private Timestamp AddTime;
	private Timestamp UpdateTime;
	
	private Course course;



	public Integer getT_Id() {
		return t_Id;
	}

	public void setT_Id(Integer t_Id) {
		this.t_Id = t_Id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getBrief() {
		return Brief;
	}

	public void setBrief(String brief) {
		Brief = brief;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Double getDiscount() {
		return Discount;
	}

	public void setDiscount(Double discount) {
		Discount = discount;
	}



	public String getTDesc() {
		return TDesc;
	}

	public void setTDesc(String tDesc) {
		TDesc = tDesc;
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

	public Integer getValid() {
		return Valid;
	}

	public void setValid(Integer valid) {
		Valid = valid;
	}


	public Timestamp getStartTime() {
		return StartTime;
	}

	public void setStartTime(Timestamp startTime) {
		StartTime = startTime;
	}

	public Timestamp getEndTime() {
		return EndTime;
	}

	public void setEndTime(Timestamp endTime) {
		EndTime = endTime;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	

}
