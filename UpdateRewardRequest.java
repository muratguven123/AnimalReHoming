package com.animalHoming.AnimalReHoming.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;
@Data
public class UpdateRewardRequest {

    @NotNull
    private Long userId;

    private String type;

    @NotNull
    private Date date;


    // Getters and Setters
}