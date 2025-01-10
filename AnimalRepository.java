package com.animalHoming.AnimalReHoming.Repository;

import com.animalHoming.AnimalReHoming.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

    
    @Modifying
    @Transactional
    @Query("DELETE FROM Animal a WHERE a.shelter.id = :shelterId AND a.id = :animalId")
    void removeAnimal(Long shelterId, Long animalId);
}
