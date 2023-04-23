package com.example.myWishList.controller.forAdmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class CreateMyWishController {

	@GetMapping("/newMyWish")
	public String goToCreateMyWishPage() {
		return "contents/mywish/new";
	}
}
