package com.example.demo;

import java.security.MessageDigest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VulnerableController {

    @GetMapping("/user")
    public String user(@RequestParam String id) throws Exception {

        // Hardcoded credential
        String password = "Admin@123";

        // Weak cryptography
        MessageDigest.getInstance("MD5");

        // SQL Injection example
        String sql = "select * from users where id='" + id + "'";

        System.out.println(sql);

        return password;
    }
}
