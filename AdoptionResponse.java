package com.animalHoming.AnimalReHoming.Response;
@lombok.Data

public class AdoptionResponse {
    private Long id;

    private String name;
    private String species;
    private String breed;
    private Integer age;
    private String size;

    public AdoptionResponse(Integer age, String breed, Long id, String name, String size, String species) {
        this.age = age;
        this.breed = breed;
        this.id = id;
        this.name = name;
        this.size = size;
        this.species = species;
    }
}
