package com.ford.bootcamp.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class HelloWorldControllerTest {
    HelloWorldController helloWorldController;

    @BeforeEach
    public void setUp() {
        helloWorldController = new HelloWorldController();
    }

    @Test
    void printTest() {
        String actualOutput = helloWorldController.print();
        assertEquals("Hello World", actualOutput);
    }

    @Test
    void printNotEqualsTest() {
        String actualOutput = helloWorldController.print();
        assertNotEquals("hi world", actualOutput);
    }
}
