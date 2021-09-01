package com.ford.bootcamp.web;

import com.ford.bootcamp.model.Address;
import com.ford.bootcamp.service.AddressService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressControllerTest {

    private  AddressService addressService;
    private AddressController addressController  = new AddressController(addressService);

    @Test
    public  void findAllTest(){
        String expectedOutput = "LASYABENTULA";
        String actualOutput = addressController.convertToUpperCase("LasyaBentula");
        assertEquals(actualOutput, expectedOutput);

    }

    @Test
    public void givenEmployees_whenGetEmployees_thenStatus200()
            throws Exception {
/*
        createTestEmployee("bob");

        mvc.perform(get("/api/employees")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].name", is("bob")));

 */
    }
}
