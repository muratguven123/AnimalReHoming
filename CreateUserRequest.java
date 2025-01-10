package com.animalHoming.AnimalReHoming.request;


@lombok.Data
public class CreateUserRequest {

    private String name;

    private String email;

    private String phone;

    private String role;

    private Integer age;

    // Getters and Setters
}