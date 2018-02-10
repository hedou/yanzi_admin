package com.ssh.course.service;

import com.ssh.course.domain.Course;
import com.ssh.term.domain.Term;
import com.ssh.utils.PageBean;

public interface CourseService {

	PageBean<Course> findCourseListByPage(int currentPage);

	Course findCourseById(Integer id);

	void delete(Course existCourse);

	void update(Course course);

	void add(Course course);

}
