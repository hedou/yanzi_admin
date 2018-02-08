package com.ssh.course.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.course.dao.CourseDao;
import com.ssh.course.domain.Course;

import com.ssh.course.service.CourseService;
import com.ssh.utils.PageBean;

@Transactional
public class CourseServiseImpl implements CourseService {

	private CourseDao courseDao;
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	
	//��ҳ���������б�
	@Override
	public PageBean<Course> findCourseListByPage(int currentPage) {
		
		PageBean<Course> pageBean = new PageBean<Course>();
		
		//ÿҳ��ʾ��¼��
		int pageSize = 4;
		pageBean.setPageSize(pageSize);
		//�ܹ���¼��
		int totalCount = 0 ;
		totalCount = courseDao.findNewsCount();
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
		List<Course> list = courseDao.findCourseListByPage(begin,pageSize);
		pageBean.setList(list);
	    pageBean.setCurrentPage(currentPage);
		
		return pageBean;
	}
	
	

}