package com.animalHoming.AnimalReHoming.Contorller;

import com.animalHoming.AnimalReHoming.Model.Shelter;
import com.animalHoming.AnimalReHoming.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shelter")
public class ShelterController {
    @Autowired
    ShelterService shelterService;
    @GetMapping("{/id}")
    public List<Shelter> getShelter(@PathVariable int id) {
        return shelterService.findAll();
    }
    @PostMapping
    public void addShelter(@RequestBody Shelter shelter) {
        shelterService.save(shelter);
    }
    @DeleteMapping
    public void deleteShelter(@RequestBody Shelter shelter) {
        shelterService.deleteById(shelter.getId());
    }
    @PutMapping
    public void updateShelter(@RequestBody Shelter shelter) {
        Shelter shelter1 = shelterService.findById(shelter.getId());
        if (shelter1 != null) {
            shelter1.setName(shelter.getName());
            shelter1.setId(shelter.getId());
            shelter1.setCapacity(shelter.getCapacity());
            shelter1.setAnimals(shelter.getAnimals());
            shelter1.setCaretakers(shelter.getCaretakers());
            shelterService.save(shelter1);
        }
    }

}
