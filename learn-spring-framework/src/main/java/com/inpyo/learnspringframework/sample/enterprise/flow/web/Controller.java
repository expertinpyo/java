package com.inpyo.learnspringframework.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inpyo.learnspringframework.sample.enterprise.flow.business.BusinessService;

@RestController // 데이터를 손쉽게 반환할 수 있게 해줌
public class Controller {
	// 웹레이어
	// UI, API 구축 중이라면 정확한 포맷으로 response하는 것과 관련

	@Autowired // businessService를 Controller 안에서 사용할 수 있게끔 해줌
	private BusinessService businessService;


	@GetMapping("/sum") // Django url.py와 비슷한 듯
	public long displaySum() {
		return businessService.calculateSum();

	}
}

