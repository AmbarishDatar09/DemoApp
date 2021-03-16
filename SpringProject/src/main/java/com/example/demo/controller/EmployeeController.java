package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
@Controller
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl service;
    @RequestMapping("/getEmployee/{tid}")
    public Employee getEmployeeById(@PathVariable("tid") int EmployeeId)
        {
        System.out.println(service.getEmployeeById(EmployeeId));
            return service.getEmployeeById(EmployeeId);
        }
    
    //@RequestMapping(value = "/addEmployeeId/",method = RequestMethod.POST)
    @PostMapping("/addEmployee")
    public void addEmployeeId(@RequestBody Employee Employee)
        {
        
             service.addEmployee(Employee);
        }
    
    @PutMapping("/updateEmployee")
    public void updateEmployeeId(@RequestBody Employee Employee)
        {
        
             service.updateEmployee(Employee);
        }
    
    @DeleteMapping("/removeEmployee/{tid}")
    public void deleteEmployeeId(@PathVariable("tid") int EmployeeId)
        {
        
             service.removeEmployee(EmployeeId);
        }
    
    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployeeId()
        {
        
             return service.getAllEmployees();
        }
}
 