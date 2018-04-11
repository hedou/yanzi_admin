package com.ssh.course.domain;

import java.io.File;
import java.sql.Timestamp;


public class Course {
	
	
//	Ôö¼Ódelete ×Ö¶Î fk
	private Integer deletes;
	

	public Integer getDeletes() {
		return deletes;
	}
	public void setDeletes(Integer deletes) {
		this.deletes = deletes;
	}
	private Integer CourseId;
	private String Title;
	private String EnTitle;
	private String Image;
	
//	Ìí¼ÓÍ¼Æ¬¶þ
	
	private Integer Valid;
	private Timestamp AddTime;
	private Timestamp UpdateTime;
	// ï¿½ï¿½ï¿½ï¿½ï¿½Ä¼ï¿½ï¿½ï¿½Ä¿Â¼Â·ï¿½ï¿½(Í¨ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½×¢ï¿½ï¿½)
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
	public Integer getCourseId() {
		return CourseId;
	}
	public void setCourseId(Integer courseId) {
		CourseId = courseId;
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
