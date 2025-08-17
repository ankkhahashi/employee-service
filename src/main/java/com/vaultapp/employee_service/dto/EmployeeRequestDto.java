package com.vaultapp.employee_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeRequestDto {

    private int emp_id;
    private String emp_name;
    private String emp_role;

}
