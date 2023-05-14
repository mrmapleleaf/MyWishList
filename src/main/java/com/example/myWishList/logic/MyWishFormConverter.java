package com.example.myWishList.logic;

import java.sql.Timestamp;

import com.example.myWishList.entity.MyWish;
import com.example.myWishList.form.MyWishForm;

public class MyWishFormConverter {

	public static MyWish convertMywishForm2MyWish(MyWishForm myWishForm) {
		MyWish myWish = new MyWish();
		
		myWish.setMyWishContent(myWishForm.getMyWishContent());
		myWish.setApprovingPerson("");
		myWish.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		myWish.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
		
		return myWish;
	}
}
