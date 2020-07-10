package com.vastika.collegeinfo.repository;

import java.util.List;

import com.vastika.collegeinfo.model.Address;

public interface AddressRepository {

    //crud
    Address createAddress(Address address);

    List<Address> getAllAddress();

    Address getAddressById(Long id);

    Address updateById(Long id);

    void deleteById(Long id);


}
