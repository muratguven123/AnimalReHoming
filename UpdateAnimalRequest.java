package com.animalHoming.AnimalReHoming.request;

import javax.validation.constraints.NotNull;
@lombok.Data
@lombok.AllArgsConstructor
public class UpdateAnimalRequest {

    private String name;

    private String species;

    private String breed;

    @NotNull
    private Integer age;

    private String size;

    @NotNull
    private Long shelterId;

    // Getters and Setters
}