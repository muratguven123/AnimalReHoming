package com.animalHoming.AnimalReHoming.Response;

import java.util.Date;

@lombok.Data
public class RewardResponse {
    private Long id;
    private Long userId;
    private String Type;
    private Date date;

    public RewardResponse(Date date, Long id, String type, Long userId) {
        this.date = date;
        this.id = id;
        Type = type;
        this.userId = userId;
    }
}
