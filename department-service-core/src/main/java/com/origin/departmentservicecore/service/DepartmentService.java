package com.origin.departmentservicecore.service;

import com.origin.departmentservicecore.dto.DepartmentResponse;
import com.origin.departmentservicecore.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Neil
 * @created 14/02/2023 - 1:47 pm
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class DepartmentService {
    /* Created by USER */


    private final DepartmentRepository departmentRepository;

    public List<DepartmentResponse> viewAllRecord(){
        return departmentRepository.findAll()
                .stream()
                .map(department -> DepartmentResponse.builder()
                        .id(department.getId())
                        .department_name(department.getDepartment_name())
                        .department_address(department.getDepartment_address())
                        .department_code(department.getDepartment_code())
                        .build()).toList();
    }

    public List<DepartmentResponse> findDepartmentLike (String department_code){
        return departmentRepository.findDepartmentLike(department_code)
                .stream()
                .map(department -> DepartmentResponse.builder()
                        .id(department.getId())
                        .department_name(department.getDepartment_name())
                        .department_code(department.getDepartment_code())
                        .department_address(department.getDepartment_address())
                        .build()).toList();
    }
}
