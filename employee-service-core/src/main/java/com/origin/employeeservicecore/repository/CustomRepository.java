package com.origin.employeeservicecore.repository;

import com.origin.employeeservicecore.model.Employee;

import java.util.List;
import java.util.Map;

/**
 * @author Neil
 * @created 14/02/2023 - 9:54 am
 */
public interface CustomRepository {
    List<Employee> findLike(String email);
}
