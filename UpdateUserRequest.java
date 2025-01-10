package com.animalHoming.AnimalReHoming.request;

import jakarta.validation.constraints.Email;
import lombok.Data;
@Data
public class UpdateUserRequest {

    private String name;


    private String email;

    private String phone;

    private String role;


    private Integer age;

    // Getters and Setters
}