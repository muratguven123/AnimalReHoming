package com.animalHoming.AnimalReHoming.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Data
public class UpdateAdoptionRequest {


    private Long userId;


    private Long animalId;

    private LocalDate adoptionDate;

    // Getters and Setters
}