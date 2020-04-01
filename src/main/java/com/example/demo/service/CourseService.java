package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	public List<Course> getCourses() {
		return (List<Course>)courseRepository.findAll();
	}

	public List<Course> saveCourses(List<Course> courses) {
		// TODO Auto-generated method stub
		return (List<Course>)courseRepository.saveAll(courses);
	}

	public Course getCoursesByName(String name) {
		// TODO Auto-generated method stub
		return courseRepository.findByName(name);
	}
}
