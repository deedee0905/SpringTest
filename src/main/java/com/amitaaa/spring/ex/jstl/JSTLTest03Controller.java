package com.amitaaa.spring.ex.jstl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSTLTest03Controller {
	
	@GetMapping("/jstl/test03/1")
	public String fmtLibrary(Model model) {
		
		// 1번 문제
		
		List<Integer> candidates = new ArrayList<>();
		candidates.add(263001);
		candidates.add(173942); 
		candidates.add(563057); 
		
		model.addAttribute("turnout", candidates);
		
		
		return "jstl/tst03";
	}

}
