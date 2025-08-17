package com.vaultapp.employee_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaultapp.employee_service.dto.EmployeeRequestDto;
import com.vaultapp.employee_service.entity.Employee;
import com.vaultapp.employee_service.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(EmployeeRequestDto dto) {

        Employee employee = new Employee();

        employee.setEmp_name(dto.getEmp_name());
        employee.setEmp_role(dto.getEmp_role());

        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
