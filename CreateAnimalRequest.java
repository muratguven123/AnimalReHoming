package com.animalHoming.AnimalReHoming.request;

import javax.validation.constraints.NotNull;
import lombok.Data;
@Data
public class CreateAnimalRequest {

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