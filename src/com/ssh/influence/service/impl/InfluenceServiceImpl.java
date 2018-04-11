package com.ssh.influence.service.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.course.domain.Course;
import com.ssh.influence.dao.InfluenceDao;
import com.ssh.influence.domain.Influence;
import com.ssh.influence.service.InfluenceService;
import com.ssh.level.dao.LevelDao;
import com.ssh.level.domain.Level;
import com.ssh.utils.PageBean;

public class InfluenceServiceImpl implements InfluenceService{
	private InfluenceDao influenceDao;
	public void setInfluenceDao(InfluenceDao influenceDao) {
		this.influenceDao = influenceDao;
	}
	@Override
	public void addInfluence(Influence influence) {
		influenceDao.addInfluence(influence);
	}

	@Override
	public void update(Influence influence) {
		influenceDao.update(influence);
	}

	@Override
	public void delete(Influence existInfluence) {
		existInfluence.setDeletes(1);
		existInfluence.setValid(1);
		influenceDao.update(existInfluence);
	}

	@Override
	public void add(Influence influence) {
		
		influenceDao.add(influence);
	}
	@Override
	public Influence findInfluenceById(Integer influenceId) {
		// TODO Auto-generated method stub
		return influenceDao.findInfluenceById(influenceId);
	}
	@Override
	public PageBean<Influence> findInfluenceListByPage(int currentPage) {
		// TODO Auto-generated method stub
PageBean<Influence> pageBean = new PageBean<Influence>();
		
		//ÿҳ��ʾ��¼��
		int pageSize = 30;
		pageBean.setPageSize(pageSize);
		//�ܹ���¼��
		int totalCount = 0 ;
		totalCount = influenceDao.findInfluenceCount();
		//System.out.println(totalCount);
		pageBean.setTotalCount(totalCount);
		//��ҳ��
		int totalPage=0;
		if (totalCount % pageSize == 0) {
			totalPage = totalCount / pageSize;
		}else {
			totalPage = totalCount/pageSize + 1;
		}
		pageBean.setTotalPage(totalPage);
		
		int begin = (currentPage - 1 ) * pageSize;
		List<Influence> list = influenceDao.findInfluenceListByPage(begin,pageSize);
		pageBean.setList(list);
	    pageBean.setCurrentPage(currentPage);
		
		return pageBean;
	}

}
