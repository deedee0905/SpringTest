package com.amitaaa.spring.ex.hw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hw03Controller {
	
	@RequestMapping("/lifecycle/hw03/1")
	public String hw03View() {
		
		return "lifecycle/hw03";
	}

}
