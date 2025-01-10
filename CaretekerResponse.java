package com.animalHoming.AnimalReHoming.Response;

import com.animalHoming.AnimalReHoming.Model.Shelter;

@lombok.Data
public class CaretekerResponse {

    private Long id;
    private String name;
    private String contact;
    private Shelter shelter;

    public CaretekerResponse(String contact, Long id, String name, Shelter shelter) {
        this.contact = contact;
        this.id = id;
        this.name = name;
        this.shelter = shelter;
    }
}
