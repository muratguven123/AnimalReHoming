package com.animalHoming.AnimalReHoming.Contorller;

import com.animalHoming.AnimalReHoming.Model.Adoption;
import com.animalHoming.AnimalReHoming.Model.Animal;
import com.animalHoming.AnimalReHoming.Repository.AdoptionRepository;
import com.animalHoming.AnimalReHoming.service.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("adoption")
public class AdoptionController {
@Autowired
    private AdoptionRepository adoptionRepository;
    @Autowired
    private AdoptionService adoptionService;

    @PutMapping
    public Adoption addAdoption(@RequestBody Long userId, @RequestBody Long animalid) {
    return adoptionService.adoption(userId,animalid);
}


}
