package com.animalHoming.AnimalReHoming.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
@Data
public class UpdateCaretakerRequest {

    private String name;

    private String contact;

    @NotNull
    private Long shelterId;

    // Getters and Setters
}