package com.example.myWishList.controller.forAdmin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.myWishList.form.MyWishForm;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class CreateMyWishController {
	
	//フィールドにDAO定義

	@GetMapping("/newMyWish")
	public String goToCreateMyWishPage(MyWishForm myWishForm, Model model) {
		model.addAttribute("myWishForm", myWishForm);
		return "contents/mywish/new";
	}
	
	@PostMapping("/createMyWish")
	public String createMyWish(@Validated MyWishForm myWishForm, BindingResult bindingResult, Model model,
			 RedirectAttributes redirectAttributes) {
		
			if(bindingResult.hasErrors()) {
				model.addAttribute("myWishForm", myWishForm);
				return "contents/mywish/new";
			}
			
			//フォームの内容を詰め替える’（詰め替え処理用のサービス/ロジック作る？）
			
			
			//インサート処理
			
			
			//index.htmlに戻る
			redirectAttributes.addFlashAttribute("登録完了メッセージ", "やりたいこと登録完了");
			return null;
		
	}
}
