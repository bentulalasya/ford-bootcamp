package com.ford.bootcamp.web;

import com.ford.bootcamp.model.Address;
import com.ford.bootcamp.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/address")
    public List<Address> findAll() {
        return addressService.retrieveAddress();
    }

    @PostMapping("/address/id")
    public Address saveAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }

    public String convertToUpperCase(String name){
        return name.toUpperCase();
    }
}
