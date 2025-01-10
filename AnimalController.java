package com.animalHoming.AnimalReHoming.Contorller;

import com.animalHoming.AnimalReHoming.Model.Animal;
import com.animalHoming.AnimalReHoming.Model.User;
import com.animalHoming.AnimalReHoming.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animal")
public class AnimalController {
    @Autowired
    AnimalRepository animalRepository;

    @GetMapping("{/id}")
    public List<Animal> getAnimals(@PathVariable Long id) {
        return animalRepository.findAll();
    }
    @PostMapping
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }
    @DeleteMapping
    public void deleteAnimal(@RequestBody Animal animal) {
        animalRepository.delete(animal);
    }
    @PutMapping
    public ResponseEntity updateAnimal(@PathVariable Long id, @RequestBody Animal animal) {
        animal = animalRepository.findById(id).get();
        if (animal != null) {
            animal.setId(id);
            animal.setName(animal.getName());
            animal.setAge(Math.toIntExact(id));
            animal.setSize(animal.getSize());
            animal.setShelter(animal.getShelter());
            animalRepository.save(animal);
        }
        return ResponseEntity.ok().build();
    }


}
