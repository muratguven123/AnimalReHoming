package com.animalHoming.AnimalReHoming.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
@Data
public class CreateShelterRequest {

    private String name;

    private String location;

    @NotNull
    private Integer capacity;

    // Getters and Setters
}