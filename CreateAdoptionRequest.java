package com.animalHoming.AnimalReHoming.request;

import javax.validation.constraints.NotNull;
import lombok.Data;
@Data
public class CreateAdoptionRequest {

    @NotNull
    private Long userId;

    @NotNull
    private Long animalId;

    // Getters and Setters
}