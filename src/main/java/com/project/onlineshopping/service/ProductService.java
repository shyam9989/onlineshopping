package com.project.onlineshopping.service;

import java.util.List;

import com.project.onlineshopping.model.Product;

public interface ProductService {

    String saveProduct(Product product);

    List<Product> findAllProducts();

    List<Product> findAllProductsForAdmin();

    Product findProductById(Integer id);

    String deleteProduct(Integer id);

    String updateProduct(Product product);

    List<Product> findProductByCategoryId(Integer categoryId);

    Product findProductByIdForAdmin(int id);


}
