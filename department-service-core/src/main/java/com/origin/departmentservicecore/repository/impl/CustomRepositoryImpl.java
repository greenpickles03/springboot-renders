package com.origin.departmentservicecore.repository.impl;

import com.origin.departmentservicecore.model.Department;
import com.origin.departmentservicecore.repository.CustomRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Neil
 * @created 14/02/2023 - 1:45 pm
 */
@Slf4j
@Transactional
public class CustomRepositoryImpl implements CustomRepository {
    /* Created by USER */

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Department> findDepartmentLike(String department_code) {
        Query query = entityManager.createQuery("select d from Department d where d.department_code =: department_code");
        query.setParameter("department_code", department_code);
        return query.getResultList();
    }
}

