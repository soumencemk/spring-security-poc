package com.soumen.poc.jdbch2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Soumen Karmakar
 * @Date 03/05/2022
 */
@RestController
public class EmployeeController {
    @GetMapping("/")
    public UserType getEmployees() {
        return new UserType("none");
    }

    @GetMapping("/admin")
    public UserType admin() {
        return new UserType("admin");
    }

    @GetMapping("/user")
    public UserType user() {
        return new UserType("user");
    }
}
