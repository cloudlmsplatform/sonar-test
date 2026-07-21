package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VulnerableControllerTest {

    @Autowired
    private VulnerableController controller;

    @Test
    void testUserApi() throws Exception {
        String result = controller.user("101");
        assertEquals("Admin@123", result);
    }
}
