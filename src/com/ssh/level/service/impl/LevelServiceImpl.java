package com.ssh.level.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.course.dao.CourseDao;
import com.ssh.course.domain.Course;
import com.ssh.level.dao.LevelDao;
import com.ssh.level.domain.Level;
import com.ssh.level.service.LevelService;
import com.ssh.term.dao.TermDao;
import com.ssh.utils.PageBean;
import com.sun.xml.internal.org.jvnet.fastinfoset.stax.LowLevelFastInfosetStreamWriter;
@Transactional
public class LevelServiceImpl implements LevelService {

	private LevelDao levelDao;
	public void setLevelDao(LevelDao levelDao) {
		this.levelDao = levelDao;
	}
	@Override
	public List<Level> findLevelListByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return levelDao.findLevelListByCourseId(courseId);
	}

	@Override
	public void addLevel(Level level) {
		// TODO Auto-generated method stub
		levelDao.addLevel(level);
	}

	@Override
	public Level findLevelById(Integer levelId) {
		// TODO Auto-generated method stub
		return levelDao.findLevelById(levelId);
	}

	@Override
	public void update(Level level) {
		// TODO Auto-generated method stub
		levelDao.update(level);
	}

	@Override
	public void delete(Level existLevel) {
		existLevel.setDeletes(1);
		existLevel.setValid(1);
		// TODO Auto-generated method stub
		levelDao.update(existLevel);
	}
	@Override
	public PageBean<Level> findLevelListByPage(int currentPage) {
		PageBean<Level> pageBean = new PageBean<Level>();
		
		//ÿҳ��ʾ��¼��
		int pageSize = 4;
		pageBean.setPageSize(pageSize);
		//�ܹ���¼��
		int totalCount = 0 ;
		totalCount = levelDao.findLevelCount();
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
		List<Level> list = levelDao.findLevelListByPage(begin,pageSize);
		pageBean.setList(list);
	    pageBean.setCurrentPage(currentPage);
		
		return pageBean;
	}
	@Override
	public void add(Level level) {
		// TODO Auto-generated method stub
		levelDao.add(level);
	}
	

}
