package com.ssh.influence.action;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.course.domain.Course;
import com.ssh.influence.domain.Influence;
import com.ssh.influence.service.InfluenceService;
import com.ssh.level.domain.Level;
import com.ssh.level.service.LevelService;
import com.ssh.utils.CopyImage;
import com.ssh.utils.ImageUploadSource;
import com.ssh.utils.PageBean;
import com.ssh.utils.UploadImage;

public class InfluenceAction extends ActionSupport implements ModelDriven<Influence>{
	private static final long serialVersionUID = 1L;
	private Influence influence = new Influence();
	@Override
	public Influence getModel() {
		// TODO Auto-generated method stub
		return influence;
	}
	private InfluenceService influenceService;
	public void setinfluenceService(InfluenceService influenceService) {
		this.influenceService = influenceService;
	}
	 private int currentPage;
		public void setCurrentPage(int currentPage) {
			this.currentPage = currentPage;
		}
	 public String edit()
	  {
	    influence = influenceService.findInfluenceById(influence.getInfluenceId());
	    HttpServletRequest request = ServletActionContext.getRequest();
	    request.setAttribute("influenceValid", influence.getValid());
	    return "edit";
	  }
	
	 
	 public String update()
	  {
		influenceService.update(influence);
		    return "updateSuccess";
	  }
	
	 public String findInfluenceListByPage(){	 
		 //��ҳ����pageBean
	    PageBean<Influence> pageBean = influenceService.findInfluenceListByPage(currentPage);
  
	    ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "influenceList";	
	}
	 
	public String delete()
	  {
		
		 Influence existInfluence = influenceService.findInfluenceById(influence.getInfluenceId());
		    influenceService.delete(existInfluence);
		    return "deleteSuccess";
		
	  }
	public String add(){
		
		influence.setValid(0);
		influence.setDeletes(0);
		influenceService.add(influence);
			return "addSuccess";
	}
}
