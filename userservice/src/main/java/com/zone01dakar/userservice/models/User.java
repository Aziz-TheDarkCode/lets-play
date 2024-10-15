package com.zone01dakar.userservice.models;
import com.zone01dakar.annotations.ValidRole;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Builder.Default;

@Data
public class User {
    private String id;

    @NotEmpty
    @Size(min=2,max=225,message = "The description must be of 2 - 255 characters")
    private String name;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 4 , max = 16,message = "The password must be of 4 - 16 characters")
    private String password;

    @ValidRole
    private String role;
}
