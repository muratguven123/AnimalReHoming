package com.animalHoming.AnimalReHoming.service;
import org.springframework.stereotype.Service;
import com.animalHoming.AnimalReHoming.Model.Animal;
import com.animalHoming.AnimalReHoming.Repository.AnimalRepository;
import com.animalHoming.AnimalReHoming.Repository.ShelterRepository;
import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;
    private final ShelterRepository shelterRepository;
    public AnimalService(AnimalRepository animalRepository, ShelterRepository shelterRepository) {
        this.animalRepository = animalRepository;
        this.shelterRepository = shelterRepository;
    }
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }
    public Animal findById(Long id) {
        return animalRepository.findById(id).orElse(null);
    }
    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }
    public void deleteById(Long id) {
        animalRepository.deleteById(id);
    }


}
