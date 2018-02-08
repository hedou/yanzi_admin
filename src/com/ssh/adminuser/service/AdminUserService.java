package com.ssh.adminuser.service;

import com.ssh.adminuser.domain.AdminUser;

public abstract interface AdminUserService
{
  public abstract AdminUser findByUserPwd(AdminUser paramAdminUser);
}
