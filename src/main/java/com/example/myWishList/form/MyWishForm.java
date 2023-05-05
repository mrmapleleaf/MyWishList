package com.example.myWishList.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyWishForm {
	
	@NotBlank
	@Size(min=1, max=255)
	private String myWishContent;
	
	public MyWishForm(String myWishContent) {
		this.myWishContent = myWishContent;
	}
}
