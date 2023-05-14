package com.example.myWishList.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.myWishList.entity.MyWish;
import com.example.myWishList.service.MyWishService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MyWishIndexController {
	
	private final MyWishService myWishService;

	@GetMapping("/")
	public String Toppage(Model model) {
		model.addAttribute("title", "やりたいことリスト");
		return "contents/contents";
	}
	
	@GetMapping("/index")
	public String goToIndexPage(Model model) {
		//全てのやりたいことを取得
		List<MyWish> myWishList = myWishService.getAllMyWishes();
		
		model.addAttribute("title", "やりたいことリスト");
		model.addAttribute("myWishList", myWishList);
		return "contents/index";
	}
}
