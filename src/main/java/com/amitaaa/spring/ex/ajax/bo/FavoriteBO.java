package com.amitaaa.spring.ex.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amitaaa.spring.ex.ajax.dao.FavoriteDAO;
import com.amitaaa.spring.ex.ajax.model.Favorite;

@Service
public class FavoriteBO {
	
	@Autowired
	private FavoriteDAO favoriteDAO;
	
	public List<Favorite> getLinkList(){
		return favoriteDAO.selectLinkList();
	}
	
	public int addlinks(String name, String url) {
		return favoriteDAO.insertLink(name, url);
	}

}
