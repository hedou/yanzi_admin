package com.ssh.course.dao;

import java.util.List;

import com.ssh.course.domain.Course;
import com.ssh.utils.PageBean;

public interface CourseDao {


	List<Course> findCourseListByPage(int begin, int pageSize);
	int findCourseCount();
	Course findCourseById(Integer id);
	void delete(Course existCourse);
	void update(Course course);
	void add(Course course);
	
}
