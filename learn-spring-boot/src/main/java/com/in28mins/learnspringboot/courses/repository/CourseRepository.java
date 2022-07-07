package com.in28mins.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28mins.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	// 데이터베이스에서 세부사항을 가져오기 위한 인터페이스, 어떤 데이터베이스로부터 가져올지, id는 무슨 타입인지를 기재해야함
}
