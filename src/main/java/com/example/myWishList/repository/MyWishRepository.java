package com.example.myWishList.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myWishList.entity.MyWish;

@Repository
public interface MyWishRepository extends JpaRepository<MyWish, Integer>{

}
