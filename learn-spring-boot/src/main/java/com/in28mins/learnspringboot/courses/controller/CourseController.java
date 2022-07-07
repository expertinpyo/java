package com.in28mins.learnspringboot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28mins.learnspringboot.courses.bean.Course;
import com.in28mins.learnspringboot.courses.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository repository;

	@GetMapping("/courses") // url 설정
	public List<Course> getAllCourses() {
//		return List.of(new Course(1, "Learn Java", "Inpyo"), new Course(2, "Learn Python", "Inpyo2"));
		return repository.findAll();
	}

	@GetMapping("/courses/{id}")
	public Course getCourseDetails(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);
		if (course.isEmpty()) {
			throw new RuntimeException("This is unavailable");
		}
		return course.get();
//		return List.of(new Course(1, "Learn python hehe", "Inpyo"));
	}

	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}

	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
	}

	@DeleteMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id) {
		repository.deleteById(id);
	}
}
