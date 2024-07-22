package com.solidWaste_backend.SolidWasteApp.mapper;


import com.solidWaste_backend.SolidWasteApp.dtos.response.EmployeeDTOCredentials;
import com.solidWaste_backend.SolidWasteApp.model.Employee;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDTOCredentials getEmployeeDTO(Employee employee);
}
