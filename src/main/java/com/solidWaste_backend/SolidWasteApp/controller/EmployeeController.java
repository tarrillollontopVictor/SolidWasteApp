package com.solidWaste_backend.SolidWasteApp.controller;
import com.solidWaste_backend.SolidWasteApp.model.Employee;
import com.solidWaste_backend.SolidWasteApp.repository.EmployeeRepository;

import com.solidWaste_backend.SolidWasteApp.service.ServiceEmployee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiEmployee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    ServiceEmployee serviceEmployee;


    @GetMapping
    public ResponseEntity<List <Employee>> getCredentialsEmployee (){
       return ResponseEntity.ok(employeeRepository.findAll());
    }
    @GetMapping ("/getEmployee/email/{email}/passwordEmployee/{passwordEmployee}")
    public void employeeCredentials(@PathVariable String email, @PathVariable String passwordEmployee) {
        serviceEmployee.validateCredentials(email, passwordEmployee);
    }

}
