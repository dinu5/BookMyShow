package com.example.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class SignupReqDTO {
    private String name;
    private String email;
    private String password;
}
