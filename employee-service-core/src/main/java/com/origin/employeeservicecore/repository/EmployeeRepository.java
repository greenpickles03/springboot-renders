package com.origin.employeeservicecore.repository;

import com.origin.employeeservicecore.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Neil
 * @created 14/02/2023 - 9:53 am
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>, CustomRepository {
    /* Created by USER */
}
