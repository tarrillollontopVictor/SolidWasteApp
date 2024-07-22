package com.solidWaste_backend.SolidWasteApp.service.Impl;


import com.solidWaste_backend.SolidWasteApp.dtos.response.EmployeeDTOCredentials;
import com.solidWaste_backend.SolidWasteApp.mapper.EmployeeMapper;
import com.solidWaste_backend.SolidWasteApp.model.Employee;
import com.solidWaste_backend.SolidWasteApp.repository.EmployeeRepository;
import com.solidWaste_backend.SolidWasteApp.service.ServiceEmployee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceEmployeeImpl implements ServiceEmployee {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public EmployeeDTOCredentials getEmployeeService(EmployeeDTOCredentials employeeDTO) {

        Employee employee = employeeRepository.getEmployeeByEmailAndPassword(employeeDTO.getEmail(), employeeDTO.getPasswordEmployee());
        return employeeMapper.getEmployeeDTO(employee);

    }

    @Override
    public void validateCredentials(String email, String passwordEmployee) {

        List <Employee> employeeList = employeeRepository.findAll();
        for (Employee employee : employeeList){
            if(employee.getEmail().equals(email) && employee.getPassword().equals(passwordEmployee)){
                System.out.println("Employee found");
            }
        }
    }


}
