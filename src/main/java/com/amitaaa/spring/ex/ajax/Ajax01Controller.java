package com.amitaaa.spring.ex.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amitaaa.spring.ex.ajax.bo.FavoriteBO;
import com.amitaaa.spring.ex.ajax.model.Favorite;

@Controller
@RequestMapping("/ajax/favorite")
public class Ajax01Controller {
	
	@Autowired
	private FavoriteBO favoriteBO;
	
	@GetMapping("/input")
	public String linkInput() {
		return "ajax/linkInput";
	}
	
	
	@GetMapping("/linkTables")
	public String linkTable(Model model) {
		
		List<Favorite> links = favoriteBO.getLinkList();
		
		model.addAttribute("links", links);
		
		return "ajax/linkTable";
		
		
	}
	
	@PostMapping("/add")
	@ResponseBody
	public Map<String, String> addLink(
			@RequestParam("name") String name
			, @RequestParam("url") String url
			) {
		
		int count = favoriteBO.addlinks(name, url);
		
		Map<String, String> map = new HashMap<>();
		
		if(count == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		
		return map;
	}
	
	// email 중복검사 api
	
	@GetMapping("/is_duplicate")
	public Map<String, Boolean> isDuplicate(@RequestParam("url") String url) {
		
		boolean isDuplicate = favoriteBO.isDuplicateEmail(url);
		// {"is_duplicate":true} or {"is_duplicate":false}
		
		Map<String, Boolean> map = new HashMap<>();
		if(isDuplicate) {
			map.put("is_duplicate", true);
		} else {
			map.put("is_duplicate", false);
		}
		return map;
	}
	
	
}
