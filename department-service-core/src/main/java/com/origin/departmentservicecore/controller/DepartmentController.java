package com.origin.departmentservicecore.controller;

import com.origin.departmentservicecore.dto.DepartmentResponse;
import com.origin.departmentservicecore.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Neil
 * @created 14/02/2023 - 1:47 pm
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/department")
@CrossOrigin(origins = "*")
public class DepartmentController {
    /* Created by USER */

    private final DepartmentService departmentService;


    @RequestMapping(value = "/viewAllRecord", method = RequestMethod.GET)
    public List<DepartmentResponse> viewAllRecord(){
        return departmentService.viewAllRecord();
    }

    @RequestMapping(value = "/findDepartmentLike", method = RequestMethod.GET)
    public List<DepartmentResponse> findDepartmentLike(@Param("department_code") String department_code){
        return departmentService.findDepartmentLike(department_code);
    }
}
