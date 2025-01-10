package com.animalHoming.AnimalReHoming.Repository;

import com.animalHoming.AnimalReHoming.Model.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.Location;
import java.util.List;

public interface ShelterRepository extends JpaRepository<Shelter,Long> {
    List<Shelter> findByShelterName(String shelterName);
    List<Shelter> findByShelterLocation(String shelterLocation);
    List<Shelter> findByShelterNameAndShelterLocation(String shelterName, String shelterLocation);
    List<Shelter> findByShelterNameAndShelterLocationAndShelterPhone(String shelterName, String shelterLocation, String shelterPhone);
    List<Shelter> findByShelterNameAndShelterLocationAndShelterPhoneAndShelterEmail(String shelterName, String shelterLocation, String shelterPhone, String shelterEmail);
    List<Shelter> findByShelterNameAndShelterLocationAndShelterPhoneAndShelterEmailAndShelterId(String shelterName, String shelterLocation, String shelterPhone, String shelterEmail, Long shelterId);
    List<Shelter> findByShelterNameAndShelterLocationAndShelterPhoneAndShelterEmailAndShelterIdAndShelterAddress(String shelterName, String shelterLocation, String shelterPhone, String shelterEmail, Long shelterId, String shelterAddress);
    List<Shelter> findByShelterNameAndShelterLocationAndShelterPhoneAndShelterEmailAndShelterIdAndShelterAddressAndShelterCity(String shelterName, String shelterLocation, String shelterPhone, String shelterEmail, Long shelterId, String shelterAddress, String shelterCity);
    List<Shelter> findByLocation(String location);

    List<Shelter> findByCapacity(Integer capacity);
}
