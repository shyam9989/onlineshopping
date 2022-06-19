package com.project.onlineshopping.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "product")
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    @NotBlank(message = "Please Enter the Product Name")
    private String name;

    @Column(name = "brand")
    @NotBlank(message = "Please Enter the Brand Name")
    private String brand;

    @Column(name = "description")
    @JsonIgnore
    @NotBlank(message = "Please Enter the Product Description")
    private String description;

    @Column(name = "unit_price")
    @Min(value = 1, message = "Unit Price atleast one (1)")
    private double unitPrice;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "is_active")
    private boolean active;

    @Column(name = "category_id")
    @JsonIgnore
    private int categoryId;

    @Column(name = "supplier_id")
    @JsonIgnore
    private int supplierId;

    @Column(name = "purchases")
    private int purchases;

    @Column(name = "views")
    private int views;

    @Transient
    private MultipartFile file;

  
    public Product() {
        this.code = "PRO" + UUID.randomUUID().toString().substring(26).toUpperCase();
    }

   

   

}
