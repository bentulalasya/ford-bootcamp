package com.ford.bootcamp.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;

public class AddressTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void addressDeserializationTest() throws IOException {
        Address addressFromJson = objectMapper.readValue(this.getClass().getResourceAsStream("/address.json"), Address.class);
        Address expectedAddress = new Address("Arezzo Dr", 78665L, "Round Rock", "TX");
        assertEquals(addressFromJson.toString(), expectedAddress.toString());
    }
}
