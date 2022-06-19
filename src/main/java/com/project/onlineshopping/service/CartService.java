package com.project.onlineshopping.service;

import com.project.onlineshopping.model.Cart;

public interface CartService {

    boolean saveCart(Cart cart);

    boolean updateCart(Cart cart);

    Cart findCart();

}
