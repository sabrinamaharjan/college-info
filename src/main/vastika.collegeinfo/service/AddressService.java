package service;

import model.Address;

import java.util.List;

public interface AddressService {

    Address createAddress(Address address);

    List<Address> getAllAddress();

    Address getAddressById(Long id);

    Address updateById(Long id);

    void deleteById(Long id);


}
