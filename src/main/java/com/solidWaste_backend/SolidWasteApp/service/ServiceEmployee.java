package com.solidWaste_backend.SolidWasteApp.service;


import com.solidWaste_backend.SolidWasteApp.dtos.response.EmployeeDTOCredentials;

public interface ServiceEmployee {

    EmployeeDTOCredentials getEmployeeService(EmployeeDTOCredentials employeeDTO);
    void validateCredentials(String email, String passwordEmployee);

}
