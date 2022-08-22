package com.amitaaa.spring.ex.miniP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mini")
public class PensionController {
	
	@GetMapping("/reservation")
	public String pensionView() {
		return "miniP/reservation";
	}

}
