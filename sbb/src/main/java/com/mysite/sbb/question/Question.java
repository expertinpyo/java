package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.mysite.sbb.answer.Answer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 자동 증가
	private Integer id;

	@Column(length = 200)
	private String subject;

	@Column(columnDefinition = "TEXT")
	private String content;

	private LocalDateTime createDate;

	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) // 이것은 answer를 참조 가는케 함, question 1, answer 다
																	// Cascade Remove 이므로 질문 삭제시 답변 삭제
	private List<Answer> answerList;

}
