package com.amitaaa.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amitaaa.spring.ex.database.bo.StoreBO;
import com.amitaaa.spring.ex.database.model.Store;

@Controller
public class StoreController {
	
	@Autowired
	private StoreBO storeBO;
	
	
	// store 모든 데이터를 json 형태로 response에 담는다
	@RequestMapping("/database/hw01")
	@ResponseBody
	public List<Store> mybatisHw01() {
		List<Store> storeList = storeBO.getStoreList();
		return storeList;
		
	}
	
	

}
