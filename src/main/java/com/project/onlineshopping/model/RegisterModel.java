package com.project.onlineshopping.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RegisterModel implements Serializable {

    private static final long serialVersionUID = 1L;
    private User user;
    private Address billing;

   

}
