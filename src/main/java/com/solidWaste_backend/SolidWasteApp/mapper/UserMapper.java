package com.solidWaste_backend.SolidWasteApp.mapper;


import com.solidWaste_backend.SolidWasteApp.dtos.request.CreateUserDTO;
import com.solidWaste_backend.SolidWasteApp.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper (componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "location.latitude", source = "latitude")
    @Mapping(target = "location.longitude", source = "longitude")
    User createUserDTOToUser(CreateUserDTO createUserDTO);
}
