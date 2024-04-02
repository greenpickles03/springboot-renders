package com.origin.employeeservicecore.controller;

import com.origin.employeeservicecore.dto.EmployeeResponse;
import com.origin.employeeservicecore.model.Employee;
import com.origin.employeeservicecore.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Neil
 * @created 14/02/2023 - 9:56 am
 */
@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@Slf4j
public class EmployeeController {
    /* Created by USER */

    private final EmployeeService employeeService;

    @RequestMapping(value = "/addRecord", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public List<Map> addRecord(@RequestBody Employee employee){
        return employeeService.addRecord(employee);
    }

    @RequestMapping(value = "/changeName", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> changeName(){
        return employeeService.changeName();
    }

    @RequestMapping(value = "/getAllRecord", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeResponse> getAllRecord(){
//        log.info("all record: " + employeeService.getAllRecord());
        return employeeService.getAllRecord();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/findLike", method = RequestMethod.GET)
    public List<Employee> findLike(@Param("email") String email){
        return employeeService.findLike(email);
    }

}
