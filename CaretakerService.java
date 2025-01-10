package com.animalHoming.AnimalReHoming.service;

import com.animalHoming.AnimalReHoming.Model.Careteker;

import com.animalHoming.AnimalReHoming.Repository.CaretekerRepository;
import com.animalHoming.AnimalReHoming.Repository.ShelterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CaretakerService {
private final CaretekerRepository caretakerRepository;
private final ShelterRepository shelterRepository;
public CaretakerService(CaretekerRepository caretakerRepository, ShelterRepository shelterRepository) {
this.caretakerRepository = caretakerRepository;
this.shelterRepository = shelterRepository;
}
public List<Careteker> findAll() {
return caretakerRepository.findAll();
}
public Careteker findById(Long id) {
return caretakerRepository.findById(id).orElse(null);
}
public Careteker save(Careteker caretaker) {
return caretakerRepository.save(caretaker);
}
public void deleteById(Long id) {
caretakerRepository.deleteById(id);
}
public List<Careteker> findByShelterId(Long shelterId) {
return caretakerRepository.findByShelterId(shelterId);
}

}
