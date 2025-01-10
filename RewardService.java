package com.animalHoming.AnimalReHoming.service;
import org.springframework.stereotype.Service;
import com.animalHoming.AnimalReHoming.Model.Reward;
import com.animalHoming.AnimalReHoming.Model.User;
import com.animalHoming.AnimalReHoming.Repository.RewardRepository;
import com.animalHoming.AnimalReHoming.Repository.UserRepository;
import java.util.Date;
import java.util.List;

@Service
public class RewardService {
private final RewardRepository rewardRepository;
private final UserRepository userRepository;
public RewardService(RewardRepository rewardRepository, UserRepository userRepository) {
this.rewardRepository = rewardRepository;
this.userRepository = userRepository;
}
public List<Reward> findAll() {
return rewardRepository.findAll();
}
public Reward findById(Long id) {
return rewardRepository.findById(id).orElse(null);
}
public Reward save(Reward reward) {
return rewardRepository.save(reward);
}
public void deleteById(Long id) {
rewardRepository.deleteById(id);
}
public Reward update(Reward reward) {
    Reward result = rewardRepository.findById(reward.getId()).orElse(null);
    if (result != null) {
        result.setId(result.getId());
        result.setUser(result.getUser());
        result.setDate(result.getDate());
        rewardRepository.save(result);
    }
    return result;
}

//public List<Reward> findByUserId(Long userId) {
//return rewardRepository.findByUserId(userId);
//}
//public List<Reward> findByUserIdAndType(Long userId, String type) {
//return rewardRepository.findByUserIdAndType(userId, type);
//}
//public List<Reward> findByUserIdAndDate(Long userId, Date date) {
//return rewardRepository.findByUserIdAndDate(userId, date);
//}
//public List<Reward> findByUserIdAndTypeAndDate(Long userId, String type, Date date) {
//return rewardRepository.findByUserIdAndTypeAndDate(userId, type, date);
//}
//public List<Reward> findByShelterId(Long shelterId) {
//return rewardRepository.findByShelterId(shelterId);
//}
//public List<Reward> findBySpecies(String species) {
//return rewardRepository.findBySpecies(species);
//}
//public List<Reward> findByBreed(String breed) {
//return rewardRepository.findByBreed(breed);
//}
//public List<Reward> findByAge(Integer age) {
//return rewardRepository.findByAge(age);
//}
//public List<Reward> findBySize(String size) {
//return rewardRepository.findBySize(size);
//}
//public List<Reward> findByShelterIdAndSpecies(Long shelterId, String species) {
//return rewardRepository.findByShelterIdAndSpecies(shelterId, species);
//}
//public List<Reward> findByShelterIdAndBreed(Long shelterId, String breed) {
//return rewardRepository.findByShelterIdAndBreed(shelterId, breed);
//}
//public List<Reward> findByShelterIdAndAge(Long shelterId, Integer age) {
//return rewardRepository.findByShelterIdAndAge(shelterId, age);
//}
//public List<Reward> findByShelterIdAndSize(Long shelterId, String size) {
//return rewardRepository.findByShelterIdAndSize(shelterId, size);
//}
//public List<Reward> findByShelterIdAndSpeciesAndBreed(Long shelterId, String species, String breed) {
//return rewardRepository.findByShelterIdAndSpeciesAndBreed(shelterId, species, breed);
//}
//public List<Reward> findByShelterIdAndSpeciesAndAge(Long shelterId, String species, Integer age) {
//return rewardRepository.findByShelterIdAndSpeciesAndAge(shelterId, species, age);
//}
//public List<Reward> findByShelterIdAndSpeciesAndSize(Long shelterId, String species, String size) {
//return rewardRepository.findByShelterIdAndSpeciesAndSize(shelterId, species, size);
//}
//public List<Reward> findByShelterIdAndBreedAndAge(Long shelterId, String breed, Integer age) {
//return rewardRepository.findByShelterIdAndBreedAndAge(shelterId, breed, age);
//}
//public List<Reward> findByShelterIdAndBreedAndSize(Long shelterId, String breed, String size) {
//return rewardRepository.findByShelterIdAndBreedAndSize(shelterId, breed, size);
//}
//public List<Reward> findByShelterIdAndAgeAndSize(Long shelterId, Integer age, String size) {
//return rewardRepository.findByShelterIdAndAgeAndSize(shelterId, age, size);
//}
//public List<Reward> findByShelterIdAndSpeciesAndBreedAndAge(Long shelterId, String species, String breed, Integer age) {
//return rewardRepository.findByShelterIdAndSpeciesAndBreedAndAge(shelterId, species, breed, age);
//}
//public List<Reward> findByShelterIdAndSpeciesAndBreedAndSize(Long shelterId, String species, String breed, String size) {
//return rewardRepository.findByShelterIdAndSpeciesAndBreedAndSize(shelterId, species, breed, size);
//}
//public List<Reward> findByShelterIdAndSpeciesAndAgeAndSize(Long shelterId, String species, Integer age, String size) {
//return rewardRepository.findByShelterIdAndSpeciesAndAgeAndSize(shelterId, species, age, size);
//}
//public List<Reward> findByShelterIdAndBreedAndAgeAndSize(Long shelterId, String breed, Integer age, String size) {
//return rewardRepository.findByShelterIdAndBreedAndAgeAndSize(shelterId, breed, age, size);
//}
//public List<Reward> findByShelterIdAndSpeciesAndBreedAndAgeAndSize(Long shelterId, String species, String breed, Integer age, String size) {
//return rewardRepository.findByShelterIdAndSpeciesAndBreedAndAgeAndSize(shelterId, species, breed, age, size);
//}
//public List<Reward> findByShelterIdAndName(Long shelterId, String name) {
//return rewardRepository.findByShelterIdAndName(shelterId, name);
//}
//public List<Reward> findByShelterIdAndNameAndSpecies(Long shelterId, String name, String species) {
//return rewardRepository.findByShelterIdAndNameAndSpecies(shelterId, name, species);
//}
//public List<Reward> findByShelterIdAndNameAndBreed(Long shelterId, String name, String breed) {
//return rewardRepository.findByShelterIdAndNameAndBreed(shelterId, name, breed);
//}









}
