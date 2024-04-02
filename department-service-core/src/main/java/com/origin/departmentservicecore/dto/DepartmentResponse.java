package com.origin.departmentservicecore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Neil
 * @created 14/02/2023 - 1:46 pm
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentResponse {
    /* Created by USER */

    private Long id;
    private String department_address;
    private String department_code;
    private String department_name;
}
