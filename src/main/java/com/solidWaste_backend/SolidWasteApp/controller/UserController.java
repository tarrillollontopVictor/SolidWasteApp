package com.solidWaste_backend.SolidWasteApp.controller;



import com.solidWaste_backend.SolidWasteApp.dtos.request.CreateUserDTO;
import com.solidWaste_backend.SolidWasteApp.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiUser")
public class UserController {

    @Autowired
    ServiceUser serviceUser;

    @PostMapping("/create")
    public ResponseEntity<Boolean> responseCreateUser(@RequestBody CreateUserDTO createUserDTO){
        return ResponseEntity.ok(serviceUser.createUser(createUserDTO));
    }

    @GetMapping("/getUser/email/{email}/password/{password}")
    public void responseGetUser(@PathVariable String email, @PathVariable String password){
        serviceUser.validateUser(email,password);
    }
}
