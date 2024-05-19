package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseModel{
    private int userId;
    private String name;
    private String email;
    private String phone;
    private  String password;
}
