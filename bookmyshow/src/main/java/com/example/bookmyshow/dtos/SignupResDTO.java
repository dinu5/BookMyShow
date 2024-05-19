package com.example.bookmyshow.dtos;

import com.example.bookmyshow.models.User;
import com.example.bookmyshow.models.UserCreationStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupResDTO {
    private User user;
    private UserCreationStatus userCreationStatus;
}
