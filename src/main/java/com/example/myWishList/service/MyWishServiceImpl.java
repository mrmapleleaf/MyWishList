package com.example.myWishList.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.myWishList.entity.MyWish;
import com.example.myWishList.repository.MyWishRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
//クラスに＠Transactionalアノテーションで、全てのメソッドにトランザクションを制御を有効にする
//検査例外、非検査例外の発生時にロールバックさせる
@Transactional(rollbackFor=Exception.class)
public class MyWishServiceImpl implements MyWishService{
	
	private final  MyWishRepository myWishRepository;
	
	public void insertMyWish(MyWish myWish) {
		myWishRepository.save(myWish);
	}

	public List<MyWish> getAllMyWishes() {
		return myWishRepository.findAll();
	}
}
