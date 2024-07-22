package com.solidWaste_backend.SolidWasteApp.service.Impl;


import com.solidWaste_backend.SolidWasteApp.dtos.request.CreateUserDTO;
import com.solidWaste_backend.SolidWasteApp.mapper.UserMapper;
import com.solidWaste_backend.SolidWasteApp.model.User;
import com.solidWaste_backend.SolidWasteApp.repository.LocationRepository;
import com.solidWaste_backend.SolidWasteApp.repository.UserRepository;
import com.solidWaste_backend.SolidWasteApp.service.ServiceUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceUserImpl implements ServiceUser {


    @Autowired
    UserRepository userRepository;

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean createUser(CreateUserDTO userDTO) {
        User user = userMapper.createUserDTOToUser(userDTO);
        userRepository.save(user);
        return true;

    }

    @Override
    public void validateUser(String email, String password) {
        List<User> userList = userRepository.findAll();
        for (User u : userList){
            if(u.getEmail().equals(email)) System.out.println("User found");
        }
    }
}
