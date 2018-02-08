package com.ssh.course.service;

import com.ssh.course.domain.Course;

import com.ssh.utils.PageBean;

public interface CourseService {

	PageBean<Course> findCourseListByPage(int currentPage);
}