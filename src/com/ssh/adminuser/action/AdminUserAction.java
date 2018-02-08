package com.ssh.adminuser.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.adminuser.domain.AdminUser;
import com.ssh.adminuser.service.AdminUserService;
import org.apache.struts2.ServletActionContext;

public class AdminUserAction extends ActionSupport implements ModelDriven<AdminUser> {
	private static final long serialVersionUID = 1L;
	private AdminUser adminUser = new AdminUser();
	private AdminUserService adminUserService;

	public AdminUser getModel() {
		return this.adminUser;
	}

	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}

	public String login() {
		AdminUser existAdminUser =adminUserService.findByUserPwd(this.adminUser);
		if (existAdminUser == null) {
			addActionError("用户名或密码错误");
			return "loginFail";
		}
		addActionMessage("登陆成功");

		ServletActionContext.getRequest().getSession().setAttribute("existAdminUser", existAdminUser);

		return "loginSuccess";
	}
}
