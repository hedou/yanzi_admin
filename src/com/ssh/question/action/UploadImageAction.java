package com.ssh.question.action;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
 
import com.opensymphony.xwork2.ActionSupport; 
import com.ssh.utils.CopyImage;
import com.ssh.utils.ImageUploadSource;
import com.ssh.utils.UploadImage; 
public class UploadImageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;  
    private File file;  
    private String fileFileName;  
    private String fileContentType;  
    private String url;  
    private String result;
	private String savePath;
	
	public void upload(){
		File srcFile = this.getFile();
		String path = ServletActionContext.getServletContext().getRealPath(this.getSavePath());
		File file = new File(path);
		String imgUrl = "";
		if(!file.exists()){
			file.mkdir();
		}
            String dstPath = path + "\\"+this.getFileFileName();  
            File dstFile = new File(dstPath);  
            new CopyImage().copy(srcFile, dstFile);
            String oldName = this.getFileFileName();
            String suffix = oldName.substring(oldName.lastIndexOf("."));
            System.out.println(ImageUploadSource.CURRICULUM_IMAGE.getPrefix());
		 
			try {
				imgUrl = new UploadImage().upload(ImageUploadSource.QUESTION_IMAGE.getPrefix(), dstPath, suffix);
			} catch (IOException e) {
				 e.printStackTrace();
			}
            result="{\"imgUrl\":\""+imgUrl+"\"}";
            HttpServletResponse response = ServletActionContext.getResponse();
            response.setContentType("text/html;charset=UTF-8");  
    		try {
    			response.getWriter().write(result);
    		} catch (IOException e) {
    			e.printStackTrace();
    		} 
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
 
	
}
