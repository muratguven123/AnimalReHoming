package com.animalHoming.AnimalReHoming.Repository;

import com.animalHoming.AnimalReHoming.Model.Careteker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CaretekerRepository extends JpaRepository<Careteker, Long> {
    List<Careteker> findByShelterId(Long shelterId);
    List<Careteker> findBySpecies(String species);
    List<Careteker> findByBreed(String breed);
    List<Careteker> findByAge(Integer age);
    List<Careteker> findBySize(String size);

}
