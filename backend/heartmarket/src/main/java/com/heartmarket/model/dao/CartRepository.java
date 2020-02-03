package com.heartmarket.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heartmarket.model.dto.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
