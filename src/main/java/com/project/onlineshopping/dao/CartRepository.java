package com.project.onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineshopping.model.Cart;

@Repository("cartRepository")
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
