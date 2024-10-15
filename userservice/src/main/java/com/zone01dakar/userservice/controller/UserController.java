package com.zone01dakar.userservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import com.zone01dakar.userservice.models.*;
import com.zone01dakar.userservice.models.DTO.UserUpdateRequest;
import com.zone01dakar.userservice.service.*;
import java.util.List;
import com.zone01dakar.userservice.response.ApiResponse;

@RestController
@RequestMapping("api/user")
public class UserController {
@Autowired
UserService userService;
      @PostMapping("/sign-in")
    
    public User signin (@Validated User user) {
        return userService.signin(user);
   }
    }

