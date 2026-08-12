package com.example.sampledemo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Employee API", description = "Employee operations")
public class EmployeeController {

    @GetMapping("/employees")
    @Operation(summary = "Get all employees")
    public String getEmployees() {
        return "Employee List";
    }
}
