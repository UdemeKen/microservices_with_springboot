package com.CB.microservices.service;

import com.CB.microservices.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();
}
