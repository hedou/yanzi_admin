package com.ssh.adminuser.dao;

import com.ssh.adminuser.domain.AdminUser;


import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class AdminUserDaoImpl extends HibernateDaoSupport implements AdminUserDao
{
  public AdminUser findByUserPwd(AdminUser adminUser)
  {
    List<AdminUser> list = (List<AdminUser>) getHibernateTemplate().find("from AdminUser where username = ? and password = ? ", new Object[] { adminUser.getUsername(), adminUser.getPassword() });
    if ((list != null) && (list.size() > 0)) {
      return list.get(0);
    }
    return null;
  }
}
