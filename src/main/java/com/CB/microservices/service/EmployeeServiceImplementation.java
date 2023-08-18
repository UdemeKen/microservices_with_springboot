package com.CB.microservices.service;

import com.CB.microservices.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee save(Employee employee) {

        if (employee.getEmployeeId() == null || employee.getEmployeeId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
