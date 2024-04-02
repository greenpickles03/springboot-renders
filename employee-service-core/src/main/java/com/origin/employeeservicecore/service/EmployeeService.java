package com.origin.employeeservicecore.service;

import com.origin.employeeservicecore.dto.EmployeeResponse;
import com.origin.employeeservicecore.model.Employee;
import com.origin.employeeservicecore.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Neil
 * @created 14/02/2023 - 9:56 am
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {
    /* Created by USER */

    private final EmployeeRepository employeeRepository;

    public List<Map> addRecord(Employee employee){
        List<Map> resList = new ArrayList<>();
        Map resMap = new HashMap();
        try{
            employeeRepository.save(employee);
            resMap.put("resMessage", "Success");
            resMap.put("resStatus", 1);
        }catch (Exception ex){
            resMap.put("resMessage", "Field");
            resMap.put("resStatus", 0);
        }
        resList.add(resMap);
        return resList;
    }

    public List<Employee> findLike(String email){
        return employeeRepository.findLike(email)
                .stream()
                .collect(Collectors.toList());
    }

    public List<EmployeeResponse> getAllRecord(){
        return employeeRepository.findAll()
                .stream()
                .map(employee -> EmployeeResponse.builder()
                        .id(employee.getId())
                        .firstName(employee.getFirstName())
                        .lastName(employee.getLastName())
                        .email(employee.getEmail())
                        .build()).toList();
    }

    public List<Employee> changeName(){
        return employeeRepository.findAll()
                .stream()
                .map(employee -> {
                    if(employee.getFirstName().equalsIgnoreCase("Andrew Neil")){
                        employee.setFirstName("Rose Anne");
                    }
                    Employee employee1 = new Employee(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail());
                    return employee1;
                }).collect(Collectors.toList());
    }

}
