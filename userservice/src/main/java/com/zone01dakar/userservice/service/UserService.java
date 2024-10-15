package com.zone01dakar.userservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zone01dakar.userservice.repository.*;
import com.zone01dakar.userservice.error.ResourceNotFoundException;
import com.zone01dakar.userservice.models.*;
import com.zone01dakar.userservice.models.DTO.UserUpdateRequest;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User signin (@Validated User prod) {
        return userRepository.save(prod);
   }

}
