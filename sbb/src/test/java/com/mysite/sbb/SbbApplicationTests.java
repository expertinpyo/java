package com.mysite.sbb;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

@SpringBootTest
class SbbApplicationTests {

	@Autowired // 객체 주입을 위해 사용하는 에너테이션. setter와 같은 역할. 테스트 코드 작성시에만 Autowired 사용하는 듯.
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question q1 = new Question();
		q1.setSubject("sbb란?");
		q1.setContent("누가 제발 알려줘");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
	}

}
