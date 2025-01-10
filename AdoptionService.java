package com.animalHoming.AnimalReHoming.service;
import com.animalHoming.AnimalReHoming.Repository.AdoptionRepository;
import com.animalHoming.AnimalReHoming.Repository.AnimalRepository;
import com.animalHoming.AnimalReHoming.Repository.ShelterRepository;
import com.animalHoming.AnimalReHoming.Repository.UserRepository;
import org.springframework.stereotype.Service;
import com.animalHoming.AnimalReHoming.Model.*;
import com.animalHoming.AnimalReHoming.Model.Animal;
import com.animalHoming.AnimalReHoming.Model.User;
import com.animalHoming.AnimalReHoming.Repository.AdoptionRepository;
import com.animalHoming.AnimalReHoming.Repository.AnimalRepository;
import com.animalHoming.AnimalReHoming.Repository.ShelterRepository;
import com.animalHoming.AnimalReHoming.Repository.UserRepository;
import java.time.LocalDate;


@Service
public class AdoptionService {
private final AdoptionRepository adoptionRepository;
private final UserRepository userRepository;
private final ShelterRepository shelterRepository;
private final AnimalRepository animalRepository;
Shelter shelter= new Shelter();
public AdoptionService(AdoptionRepository adoptionRepository, UserRepository userRepository, ShelterRepository shelterRepository, AnimalRepository animalRepository) {
this.adoptionRepository = adoptionRepository;
this.userRepository = userRepository;
this.shelterRepository = shelterRepository;
this.animalRepository = animalRepository;
}
public Adoption adoption(Long userId, Long animalId) {
    Adoption adoption = new Adoption();
User user = userRepository.findById(userId)
.orElseThrow(() -> new RuntimeException("User not found"));
Animal animal = animalRepository.findById(animalId)
.orElseThrow(() -> new RuntimeException("Animal not found"));
if(user.getRole().equals("ADOPTER") && adoption.isAdopted()) {
adoption.setUser(user);
adoption.setAnimal(animal);
adoption.setDate(adoption.getDate());
adoption.setAdopted(adoption.isAdopted());
animalRepository.removeAnimal(userId,animalId);// Because if someone adopts an animal, it should be removed from the shelter
return adoptionRepository.save(adoption);
}
else{
    throw new RuntimeException("Adoption not possible");
}

}






}


