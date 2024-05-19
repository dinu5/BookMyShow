package com.example.bookmyshow.services;

import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserService {
    private UserRepository userRepository;
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User signup(String name, String email, String password) {
        User user = new User();
        // check whether the email is already exist in the db
        // will use Optional
        User isPresent = userRepository.findUserByEmail(email);
        if(isPresent!=null){
            throw new RuntimeException("User already exist");
        }
        user.setName(name);
        user.setEmail(email);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(password));
        return userRepository.save(user);
    }
    public User login(String email,String password){
        // will implement once i will integrate db
        return null;
    }
}
