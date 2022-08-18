package com.amitaaa.spring.ex.jstl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amitaaa.spring.ex.jstl.bo.WeatherBO;
import com.amitaaa.spring.ex.jstl.model.Weather;

@Controller
@RequestMapping("/jstl/test05")
public class JSTLTest05Controller {
	
	@Autowired
	private WeatherBO weatherBO;
	
	@GetMapping("/list")
	public String weatherHistory(Model model) {
		
		List<Weather> weatherHistory = weatherBO.getWeathHistory();
		
		model.addAttribute("weatherHistory", weatherHistory);
		
		return "jstl/test05";
	}
	
	@GetMapping("/input")
	public String weatherInput() {
		return "jstl/test05_input";
	}
	
	@GetMapping("/add")
	@ResponseBody
	public String addWeather(
			@DateTimeFormat(pattern="yyyy년 MM월 dd일")
			@RequestParam("date") Date date
			, @RequestParam("weather") String weather
			, @RequestParam("temperatures") double temperatures
			, @RequestParam("precipitation") double precipitation
			, @RequestParam("microDust") String microDust
			, @RequestParam("windSpeed") double windSpeed) {
		
		int count = weatherBO.addWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		return "redirect : /jstl/test05/list";
		
	}
	
	

}
