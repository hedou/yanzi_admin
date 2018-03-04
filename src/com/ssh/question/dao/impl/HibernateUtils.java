package com.ssh.question.dao.impl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;  
public class HibernateUtils {
	public static SessionFactory sf;

    // ��֤�����ʱ��ִ��һ�Σ���֤SessionFactoryֻ����һ����
    static {
        Configuration cf = new Configuration();
        cf.configure();
        sf = cf.buildSessionFactory();
    }

    public static Session getCurrentSession() {
        return sf.getCurrentSession();

    }

    public static Session getOpenSession() {
        return sf.openSession();
    }
}
