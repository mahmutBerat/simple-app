package com.mahmut.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahmut.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
