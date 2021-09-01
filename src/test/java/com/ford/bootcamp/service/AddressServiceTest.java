package com.ford.bootcamp.service;

import com.ford.bootcamp.model.Address;
import com.ford.bootcamp.repository.AddressRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
public class AddressServiceTest {

    @Mock
    private AddressRepository addressRepository;

    @InjectMocks private AddressService addressService;

    @Test
    void retrieveAddressTest(){
        addressService.retrieveAddress();
        verify(addressRepository).findAll();
    }

    @Test
    void saveAddressTest(){
        Address inputAddress = new Address("Arezzo Dr", 78665L, "Round Rock", "TX");

        addressService.saveAddress(inputAddress);
        verify(addressRepository).save(inputAddress);
    }
}
