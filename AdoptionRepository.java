package com.animalHoming.AnimalReHoming.Repository;

import com.animalHoming.AnimalReHoming.Model.Adoption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AdoptionRepository extends JpaRepository<Adoption, Long> {
    List<Adoption> findByAnimalId(Long animalId);
    List<Adoption> findByUserId(Long userId);
    List<Adoption> findByShelterId(Long shelterId);
    List<Adoption> findByStatus(String status);
    List<Adoption> findByDate(Date date);
    List<Adoption> findByDateBetween(Date startDate, Date endDate);
    List<Adoption> findByAnimalIdAndUserId(Long animalId, Long userId);
    List<Adoption> findByAnimalIdAndShelterId(Long animalId, Long shelterId);
    List<Adoption> findByUserIdAndShelterId(Long userId, Long shelterId);
    List<Adoption> findByAnimalIdAndStatus(Long animalId, String status);
    List<Adoption> findByUserIdAndStatus(Long userId, String status);
    List<Adoption> findByShelterIdAndStatus(Long shelterId, String status);
    List<Adoption> findByAnimalIdAndDate(Long animalId, Date date);
    List<Adoption> findByUserIdAndDate(Long userId, Date date);
    List<Adoption> findByShelterIdAndDate(Long shelterId, Date date);
    List<Adoption> findByAnimalIdAndDateBetween(Long animalId, Date startDate, Date endDate);
    List<Adoption> findByUserIdAndDateBetween(Long userId, Date startDate, Date endDate);
    List<Adoption> findByShelterIdAndDateBetween(Long shelterId, Date startDate, Date endDate);
    List<Adoption> findByAnimalIdAndStatusAndDate(Long animalId, String status, Date date);
    List<Adoption> findByUserIdAndStatusAndDate(Long userId, String status, Date date);
    List<Adoption> findByShelterIdAndStatusAndDate(Long shelterId, String status, Date date);
    List<Adoption> findByAnimalIdAndStatusAndDateBetween(Long animalId, String status, Date startDate, Date endDate);
    List<Adoption> findByUserIdAndStatusAndDateBetween(Long userId, String status, Date startDate, Date endDate);
    List<Adoption> findByShelterIdAndStatusAndDateBetween(Long shelterId, String status, Date startDate, Date endDate);
    List<Adoption> findByAnimalIdAndUserIdAndShelterId(Long animalId, Long userId, Long shelterId);
    List<Adoption> findByAnimalIdAndUserIdAndStatus(Long animalId, Long userId, String status);

}
