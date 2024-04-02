package com.origin.employeeservicecore.repository.impl;

import com.origin.employeeservicecore.model.Employee;
import com.origin.employeeservicecore.repository.CustomRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author Neil
 * @created 14/02/2023 - 9:54 am
 */
@Slf4j
@Transactional
public class CustomRepositoryImpl implements CustomRepository {

    /* Created by USER */

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Employee> findLike(String email) {
        Query query = entityManager.createQuery("SELECT e FROM Employee  e where e.email =: email");
        query.setParameter("email", email);
        return query.getResultList();
    }

}