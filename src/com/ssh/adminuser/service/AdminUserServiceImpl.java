package com.ssh.adminuser.service;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.adminuser.dao.AdminUserDao;
import com.ssh.adminuser.domain.AdminUser;

@Transactional
public class AdminUserServiceImpl implements AdminUserService {
	private AdminUserDao adminUserDao;

	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}

	public AdminUser findByUserPwd(AdminUser adminUser) {
		return this.adminUserDao.findByUserPwd(adminUser);
	}
}
