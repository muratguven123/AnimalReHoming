package com.animalHoming.AnimalReHoming.Response;

import lombok.Data;

@Data
public class AnimalResponse {

    private Long id;

    private String name;
    private String species;
    private String breed;
    private Integer age;
    private String size;

    public AnimalResponse(Integer age, String breed, Long id, String name, String size, String species) {
        this.age = age;
        this.breed = breed;
        this.id = id;
        this.name = name;
        this.size = size;
        this.species = species;
    }
}
