package com.vastika.collegeinfo.service;

import java.util.List;

import com.vastika.collegeinfo.model.Address;

public interface AddressService {

    Address createAddress(Address address);

    List<Address> getAllAddress();

    Address getAddressById(Long id);

    Address updateById(Long id);

    void deleteById(Long id);


}
