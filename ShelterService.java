package com.animalHoming.AnimalReHoming.service;
import org.springframework.stereotype.Service;
import com.animalHoming.AnimalReHoming.Model.Animal;
import com.animalHoming.AnimalReHoming.Model.Careteker;
import com.animalHoming.AnimalReHoming.Model.Shelter;
import com.animalHoming.AnimalReHoming.Repository.AnimalRepository;
import com.animalHoming.AnimalReHoming.Repository.CaretekerRepository;
import com.animalHoming.AnimalReHoming.Repository.ShelterRepository;

import java.util.List;
@Service
public class ShelterService {
private final ShelterRepository shelterRepository;
private final AnimalRepository animalRepository;
private final CaretekerRepository caretakerRepository;

public ShelterService(ShelterRepository shelterRepository, AnimalRepository animalRepository, CaretekerRepository caretakerRepository) {
this.shelterRepository = shelterRepository;
this.animalRepository = animalRepository;
this.caretakerRepository = caretakerRepository;
}

public List<Shelter> findAll() {
return shelterRepository.findAll();
}
public Shelter findById(Long id) {
return shelterRepository.findById(id).orElse(null);
}
public Shelter save(Shelter shelter) {
return shelterRepository.save(shelter);
}
public void deleteById(Long id) {
shelterRepository.deleteById(id);
}
public List<Shelter> findByLocation(String location) {
return shelterRepository.findByLocation(location);
}
public List<Shelter> findByCapacity(Integer capacity) {
return shelterRepository.findByCapacity(capacity);
}
public Shelter saveAnimal(Long shelterId, Long animalId) {
    Shelter shelter = shelterRepository.findById(shelterId)
        .orElseThrow(() -> new RuntimeException("Shelter not found"));
    Animal animal = animalRepository.findById(animalId)
        .orElseThrow(() -> new RuntimeException("Animal not found"));
    shelter.getAnimals().add(animal);
    return shelterRepository.save(shelter);
}
public Shelter saveCaretaker(Long shelterId, Long caretakerId) {
    Shelter shelter = shelterRepository.findById(shelterId)
        .orElseThrow(() -> new RuntimeException("Shelter not found"));
    Careteker caretaker = caretakerRepository.findById(caretakerId)
        .orElseThrow(() -> new RuntimeException("Caretaker not found"));
    shelter.getCaretakers().add(caretaker);
    return shelterRepository.save(shelter);
}
public Shelter removeAnimal(Long shelterId, Long animalId) {
    Shelter shelter = shelterRepository.findById(shelterId)
        .orElseThrow(() -> new RuntimeException("Shelter not found"));
    Animal animal = animalRepository.findById(animalId)
        .orElseThrow(() -> new RuntimeException("Animal not found"));
    shelter.getAnimals().remove(animal);
    return shelterRepository.save(shelter);
}
public Shelter removeCaretaker(Long shelterId, Long caretakerId) {
    Shelter shelter = shelterRepository.findById(shelterId)
        .orElseThrow(() -> new RuntimeException("Shelter not found"));
    Careteker caretaker = caretakerRepository.findById(caretakerId)
        .orElseThrow(() -> new RuntimeException("Caretaker not found"));
    shelter.getCaretakers().remove(caretaker);
    return shelterRepository.save(shelter);
}
public Shelter updateCapacity(Long shelterId, Integer capacity) {
    Shelter shelter = shelterRepository.findById(shelterId)
        .orElseThrow(() -> new RuntimeException("Shelter not found"));
    shelter.setCapacity(capacity);
    return shelterRepository.save(shelter);
}
public Shelter updateLocation(Long shelterId, String location) {
    Shelter shelter = shelterRepository.findById(shelterId)
        .orElseThrow(() -> new RuntimeException("Shelter not found"));
    shelter.setLocation(location);
    return shelterRepository.save(shelter);
}
public Shelter updateCareTaker(Long shelterId, List<Careteker> caretakers) {
    Shelter shelter = shelterRepository.findById(shelterId)
        .orElseThrow(() -> new RuntimeException("Shelter not found"));
    shelter.setCaretakers(caretakers);
    return shelterRepository.save(shelter);
}
public Shelter updateAnimal(Long shelterId, List<Animal> animals) {
    Shelter shelter = shelterRepository.findById(shelterId)
        .orElseThrow(() -> new RuntimeException("Shelter not found"));
    shelter.setAnimals(animals);
    return shelterRepository.save(shelter);
}
public Shelter updateShelter(Long shelterId, Shelter shelter) {
    Shelter shelter1 = shelterRepository.findById(shelterId)
        .orElseThrow(() -> new RuntimeException("Shelter not found"));
    shelter1.setAnimals(shelter.getAnimals());
    shelter1.setCaretakers(shelter.getCaretakers());
    shelter1.setCapacity(shelter.getCapacity());
    shelter1.setLocation(shelter.getLocation());
    return shelterRepository.save(shelter1);
}








}
