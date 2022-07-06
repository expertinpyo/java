package com.in28mins.learnspringboot.courses.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28mins.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	@GetMapping("/courses") // url 설정
	public List<Course> getAllCourses() {
		return List.of(new Course(1, "Learn Java", "Inpyo"), new Course(2, "Learn Python", "Inpyo2"));
	}

	@GetMapping("/courses/1")
	public List<Course> getCourseDetails() {
		return List.of(new Course(1, "Learn python hehe", "Inpyo"));
	}
}
