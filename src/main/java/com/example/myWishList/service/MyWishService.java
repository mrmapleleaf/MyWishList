package com.example.myWishList.service;

import java.util.List;

import com.example.myWishList.entity.MyWish;

public interface MyWishService {
	
	//やりたいことの新規登録
	public void insertMyWish(MyWish myWish);
	
	//やりたいことの一覧表示
	public List<MyWish> getAllMyWishes();
	
	//やりたいことの詳細表示
	
}
