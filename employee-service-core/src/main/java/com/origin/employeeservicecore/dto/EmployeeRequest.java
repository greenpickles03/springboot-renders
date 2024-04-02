package com.origin.employeeservicecore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Neil
 * @created 14/02/2023 - 9:55 am
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeRequest {
    /* Created by USER */
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
