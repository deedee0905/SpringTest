package com.amitaaa.spring.ex.jstl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.amitaaa.spring.ex.jstl.model.Weather;

@Controller
public class JSTLTest05Controller {

	
	@GetMapping("jstl/test05/1")
	public String getPastWeather(Model model) {
		
		List<Weather> weatherList = new ArrayList<>();
		
		Weather weather = new Weather();
		
		// 5
		weather.setDate("2015-07-01");
		weather.setWeather("비");
		weather.setTemperatures(21.9);
		weather.setPrecipitation(83.5);
		weather.setMicroDust("보통");
		weather.setWindSpeed(2.9);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-02");
		weather.setWeather("비");
		weather.setTemperatures(22.6);
		weather.setPrecipitation(59.5);
		weather.setMicroDust("보통");
		weather.setWindSpeed(2.5);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-03");
		weather.setWeather("흐림");
		weather.setTemperatures(27.4);
		weather.setPrecipitation(0.0);
		weather.setMicroDust("좋음");
		weather.setWindSpeed(2.9);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-04");
		weather.setWeather("맑음");
		weather.setTemperatures(27.3);
		weather.setPrecipitation(0.0);
		weather.setMicroDust("좋음");
		weather.setWindSpeed(6.1);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-05");
		weather.setWeather("구름조금");
		weather.setTemperatures(25.3);
		weather.setPrecipitation(0.0);
		weather.setMicroDust("나쁨");
		weather.setWindSpeed(4.3);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-06");
		weather.setWeather("맑음");
		weather.setTemperatures(23.9);
		weather.setPrecipitation(0.0);
		weather.setMicroDust("나쁨");
		weather.setWindSpeed(6.5);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-07");
		weather.setWeather("맑음");
		weather.setTemperatures(23.7);
		weather.setPrecipitation(0.0);
		weather.setMicroDust("좋음");
		weather.setWindSpeed(5.8);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-08");
		weather.setWeather("흐림");
		weather.setTemperatures(23.3);
		weather.setPrecipitation(0.0);
		weather.setMicroDust("좋음");
		weather.setWindSpeed(5.4);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-09");
		weather.setWeather("비");
		weather.setTemperatures(20.8);
		weather.setPrecipitation(14.0);
		weather.setMicroDust("보통");
		weather.setWindSpeed(2.5);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-10");
		weather.setWeather("비");
		weather.setTemperatures(23.7);
		weather.setPrecipitation(16.5);
		weather.setMicroDust("보통");
		weather.setWindSpeed(2.5);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-11");
		weather.setWeather("비");
		weather.setTemperatures(26.8);
		weather.setPrecipitation(3.0);
		weather.setMicroDust("좋음");
		weather.setWindSpeed(4.7);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-12");
		weather.setWeather("비");
		weather.setTemperatures(26.6);
		weather.setPrecipitation(1.0);
		weather.setMicroDust("나쁨");
		weather.setWindSpeed(5.4);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-13");
		weather.setWeather("구름조금");
		weather.setTemperatures(27.3);
		weather.setPrecipitation(0.0);
		weather.setMicroDust("최악");
		weather.setWindSpeed(6.5);
		weatherList.add(weather);
		
		weather = new Weather();
		weather.setDate("2015-07-14");
		weather.setWeather("맑음");
		weather.setTemperatures(27.9);
		weather.setPrecipitation(0.0);
		weather.setMicroDust("보통");
		weather.setWindSpeed(6.8);
		weatherList.add(weather);
		
		
		model.addAttribute("pastWeatherList", weatherList);
		
		
		
		return "jstl/test05";
	}
	
	@GetMapping("jstl/test05/2")
	public String intputWeather() {
		
		return "jstl/test05_input";
	}
	
	

}
