package com.amitaaa.spring.ex.hw;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/test01")
public class Hw01Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String testProject() {
		
		
		return "테스트 프로젝트 완성 \n해당 프로젝트를 통해서 문제 풀이를 진행합니다.";
		
	}
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> mapResponse() {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 85);
		
		return map;
	}

}
