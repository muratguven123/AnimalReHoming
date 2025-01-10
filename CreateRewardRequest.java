package com.animalHoming.AnimalReHoming.request;

import javax.validation.constraints.NotNull;
import java.util.Date;
@lombok.Data
public class CreateRewardRequest {

    @NotNull
    private Long userId;

    private String type;

    @NotNull
    private Date date;

    // Getters and Setters
}