package com.endwordgame.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EndWordGameController {
	
	@RequestMapping("/begin")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
