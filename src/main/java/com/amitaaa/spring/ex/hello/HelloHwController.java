package com.amitaaa.spring.ex.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloHwController {

	@RequestMapping("/hello/hw01") //url 맵핑
	@ResponseBody
	public String HelloHwController() {
		
		return "Hello World";
	}
	
}
