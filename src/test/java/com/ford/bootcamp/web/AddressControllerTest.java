package com.ford.bootcamp.web;

import com.ford.bootcamp.model.Address;
import com.ford.bootcamp.model.AddressTest;
import com.ford.bootcamp.service.AddressService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class AddressControllerTest {

    @Mock
    private AddressService addressService;

    @InjectMocks
    private AddressController addressController;


    @Test
    void findAllTest() {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Arezzo Dr", 78665L, "Round Rock", "TX"));
        when(addressService.retrieveAddress()).thenReturn(addresses);
        List<Address> actualOutput = addressController.findAll();
        assertEquals(actualOutput, addresses);
    }

    @Test
    void saveTest() {
        Address inputAddress = new Address("Arezzo Dr", 78665L, "Round Rock", "TX");
        Address expectedAddress = new Address("Arezzo Dr", 78665L, "Round Rock", "TX");
        expectedAddress.setId(1);
        when(addressService.saveAddress(inputAddress)).thenReturn(expectedAddress);
        Address actualOutput = addressController.saveAddress(inputAddress);
        assertEquals(actualOutput, expectedAddress);
    }
}
