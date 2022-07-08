package com.mysite.sbb.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class QuestionController {

	// Service 사용 이유 : 모듈화의 이점, 보안 문제 때문에 사용 권장됨
	// 여기선 현재 구현되어 있지 않으나 Entity class 대신 DTO(Data Transfer Object) 클래스 필요.
	// 실제 업무에선 Entity 클래스를 대신할 DTO 클래스를 만들어 사용한다.
	// Controller들은 직접 Repository를 거치지 않고 Controller => Service => Repository 구조로
	// 사용하면 된다.
//	private final QuestionRepository questionRepository;
	private final QuestionService questionService;

//	@RequestMapping("/question/list")
	@RequestMapping("/list")
	public String list(Model model) {
//		List<Question> questionList = this.questionRepository.findAll();
		List<Question> questionList = this.questionService.getList();
		model.addAttribute("questionList", questionList);
		return "question_list";
	}

//	@RequestMapping(value = "/question/detail/{id}")
	@RequestMapping(value = "/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Question question = this.questionService.getQuestion(id);
		model.addAttribute("question", question);
		return "question_detail";
	}
}

