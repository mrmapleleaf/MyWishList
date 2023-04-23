package com.example.myWishList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MyWishIndexController {

	@GetMapping("/")
	public String Toppage(Model model) {
		model.addAttribute("title", "やりたいことリスト");
		return "contents/contents";
	}
	
	@GetMapping("/index")
	public String goToIndexPage(Model model) {
		model.addAttribute("title", "やりたいことリスト");
		return "contents/index";
	}
}
