package com.project.onlineshopping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineshopping.model.CartLine;

@Repository("cartLineRepository")
public interface CartLineRepository extends JpaRepository<CartLine, Integer> {

    List<CartLine> findCartLineByCartId(int cartId);

    CartLine findCartLineByCartIdAndProductId(int cartId, int id);

}
