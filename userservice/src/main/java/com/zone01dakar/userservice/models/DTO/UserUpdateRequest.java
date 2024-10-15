package com.zone01dakar.userservice.models.DTO;

import lombok.Data;

@Data
public class UserUpdateRequest {
    private String name;
    private String description;
    private Double price;
}
