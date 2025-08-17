package com.vaultapp.employee_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaultapp.employee_service.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Custom query methods can be defined here if needed

}
