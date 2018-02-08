package com.ssh.adminuser.dao;

import com.ssh.adminuser.domain.AdminUser;

public  interface AdminUserDao
{
  public AdminUser findByUserPwd(AdminUser paramAdminUser);
}
