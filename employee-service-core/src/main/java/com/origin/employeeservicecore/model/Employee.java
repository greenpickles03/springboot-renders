package com.origin.employeeservicecore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Neil
 * @created 14/02/2023 - 9:52 am
 */
@Entity
@Getter
@Setter
@Table(name = "employee_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    /* Created by USER */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
