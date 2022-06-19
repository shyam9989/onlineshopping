package com.project.onlineshopping.serviceimplementation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.onlineshopping.dao.CartRepository;
import com.project.onlineshopping.model.Cart;
import com.project.onlineshopping.model.UserModel;
import com.project.onlineshopping.service.CartService;

@Service("cartService")
public class CartServiceImpl implements CartService {

    @Qualifier("cartRepository")
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private HttpSession httpSession;

    @Override
    public boolean saveCart(Cart cart) {
        // TODO Auto-generated method stub
        cartRepository.saveAndFlush(cart);
        return true;
    }

    @Override
    public boolean updateCart(Cart cart) {
        // TODO Auto-generated method stub
        cartRepository.saveAndFlush(cart);
        return true;
    }

    @Override
    public Cart findCart() {
        // TODO Auto-generated method stub
        return ((UserModel) httpSession.getAttribute("userModel")).getCart();
    }

}
