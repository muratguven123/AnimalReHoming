package com.animalHoming.AnimalReHoming.Repository;

import com.animalHoming.AnimalReHoming.Model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RewardRepository extends JpaRepository<Reward, Long> {
    List<Reward> findByShelterId(Long shelterId);
    List<Reward> findBySpecies(String species);
    List<Reward> findByBreed(String breed);
    List<Reward> findByAge(Integer age);
    List<Reward> findBySize(String size);
    List<Reward> findByShelterIdAndSpecies(Long shelterId, String species);

}
