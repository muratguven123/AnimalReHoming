package com.animalHoming.AnimalReHoming.request;

import javax.validation.constraints.NotNull;
@lombok.Data

public class CreateCaretakerRequest {

    private String name;

    private String contact;

    @NotNull
    private Long shelterId;

    // Getters and Setters
}