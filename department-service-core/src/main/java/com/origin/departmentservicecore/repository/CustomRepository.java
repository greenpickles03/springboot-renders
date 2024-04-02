package com.origin.departmentservicecore.repository;

import com.origin.departmentservicecore.model.Department;

import java.util.List;

/**
 * @author Neil
 * @created 14/02/2023 - 1:45 pm
 */
public interface CustomRepository {

    List<Department> findDepartmentLike(String code);
}
