package com.project.onlineshopping.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name = "cart_line")
@Getter
@Setter
@ToString
public class CartLine implements Serializable {

   
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    private Product product;

    @Column(name = "cart_id")
    private int cartId;

    @Column(name = "total")
    private double total;

    @Column(name = "product_count")
    private int productCount;

    @Column(name = "buying_price")
    private double buyingPrice;

    @Column(name = "is_available")
    private boolean isAvailable;

   

   

}
