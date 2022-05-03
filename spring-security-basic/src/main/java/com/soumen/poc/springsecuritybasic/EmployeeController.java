package com.soumen.poc.springsecuritybasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Soumen Karmakar
 * @Date 03/05/2022
 */
@RestController
public class EmployeeController {

    List<Employee> EMPLOYEELIST = new ArrayList<>();

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> list = fetchEmployees();
        return list;
    }

    private List<Employee> fetchEmployees() {
        if (EMPLOYEELIST.isEmpty()) {
            EMPLOYEELIST = Arrays.asList("Soumen", "Daniel", "Vlad", "Ian", "Vasilis", "Bob")
                    .stream()
                    .map(name -> new Employee(UUID.randomUUID().toString(), name))
                    .collect(Collectors.toList());
        }
        return EMPLOYEELIST;
    }
}
