package com.origin.departmentservicecore.repository;

import com.origin.departmentservicecore.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Neil
 * @created 14/02/2023 - 1:44 pm
 */
public interface DepartmentRepository extends JpaRepository<Department, Long>, CustomRepository {
}
