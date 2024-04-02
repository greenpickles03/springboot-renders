package com.origin.departmentservicecore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Neil
 * @created 14/02/2023 - 1:44 pm
 */
@Entity
@Getter
@Setter
@Table(name = "department_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    /* Created by USER */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String department_address;
    private String department_code;
    private String department_name;
}
