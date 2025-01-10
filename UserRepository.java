package com.animalHoming.AnimalReHoming.Repository;

import com.animalHoming.AnimalReHoming.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByPhone(String phone);
    User findByCity(String city);
    User findByState(String state);
    User findByZipCode(String zipCode);
    User findByCountry(String country);
    User findByAddress(String address);
    User findByRole(String role);
    User findByFirstName(String firstName);
    User findByLastName(String lastName);
    User findByAge(Integer age);
    User findByUserId(Long userId);

}
