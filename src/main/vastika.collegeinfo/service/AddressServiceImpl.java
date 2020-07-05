package service;

import model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import repository.AddressRepository;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address createAddress(Address address) {
        final Address returnedAddress = addressRepository.createAddress(address);
        return returnedAddress;
    }

    @Override
    public List<Address> getAllAddress() {
        final List<Address> addressList = addressRepository.getAllAddress();

        return addressList;
    }

    @Override
    public Address getAddressById(Long id) {
        final Address addressById = addressRepository.getAddressById(id);

        return addressById;
    }

    @Override
    public Address updateById(Long id) {
        final Address updateById = addressRepository.updateById(id);
        return updateById;
    }

    @Override
    public void deleteById(Long id) {
        addressRepository.deleteById(id);

    }
}
