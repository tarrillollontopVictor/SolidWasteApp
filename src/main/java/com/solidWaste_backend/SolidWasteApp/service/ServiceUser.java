package com.solidWaste_backend.SolidWasteApp.service;


import com.solidWaste_backend.SolidWasteApp.dtos.request.CreateUserDTO;

public interface ServiceUser {


    boolean createUser(CreateUserDTO createUserDTO);
    void validateUser(String email, String password);
}
