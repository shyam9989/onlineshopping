package com.project.onlineshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineshopping.model.Address;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Integer> {

    Address findAddressByBilling(boolean billing);

}
