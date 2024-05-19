package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.SignupReqDTO;
import com.example.bookmyshow.dtos.SignupResDTO;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.models.UserCreationStatus;
import com.example.bookmyshow.services.UserService;

public class UserController {
    private UserService userService;
    UserController(UserService userService){
        this.userService = userService;
    }
    public SignupResDTO signup(SignupReqDTO signupReqDTO){
        User user = userService.signup(signupReqDTO.getName(),
                signupReqDTO.getEmail(),signupReqDTO.getPassword());
        SignupResDTO signupResDTO = new SignupResDTO();
        signupResDTO.setUser(user);
        signupResDTO.setUserCreationStatus(UserCreationStatus.SUCCESS);
        return  signupResDTO;
    }
}
