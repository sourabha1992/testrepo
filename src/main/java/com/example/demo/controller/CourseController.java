package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;

	@RequestMapping(value = "/addCourse", method = RequestMethod.POST)
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	@RequestMapping(value = "/getCourses", method = RequestMethod.GET)
	public List<Course> getCourses() {
		return courseService.getCourses();
	}
	@RequestMapping(value = "/getCourses/{name}", method = RequestMethod.GET)
	public Course getCoursesByName(@PathVariable String name) {
		return courseService.getCoursesByName(name);
	}

	@RequestMapping(value = "/saveAllCourse", method = RequestMethod.POST)
	public List<Course> saveCourses(@RequestBody List<Course> courses) {
		return courseService.saveCourses(courses);
	}
}
