package com.project.onlineshopping.service;

import com.project.onlineshopping.model.Address;

public interface AddressService {

    boolean saveAddress(Address address);

    Address findAddressByBilling(boolean billing);

}
