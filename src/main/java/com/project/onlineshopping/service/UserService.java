package com.project.onlineshopping.service;

import com.project.onlineshopping.model.User;

public interface UserService {

    boolean saveUser(User user);

    User findUserByEmail(String email);

}
