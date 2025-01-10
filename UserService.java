package com.animalHoming.AnimalReHoming.service;
import com.animalHoming.AnimalReHoming.Model.User;
import com.animalHoming.AnimalReHoming.Repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
private final UserRepository userRepository;
public UserService(UserRepository userRepository) {
this.userRepository = userRepository;
}
public List<User> findAll() {
return userRepository.findAll();
}
public User findById(Long id) {
    return userRepository.findById(id).orElse(null);
}
public User save(User user) {
    return userRepository.save(user);
}
public void deleteById(Long id) {
    userRepository.deleteById(id);
}
public User findByUsername(String username) {
    return userRepository.findByUsername(username);
}
public User findByEmail(String email) {
    return userRepository.findByEmail(email);   
}
public User findByPhone(String phone) {
    return userRepository.findByPhone(phone);
}
public User findByRole(String role) {
    return userRepository.findByRole(role);
}
public User findByAge(Integer age){
    return userRepository.findByAge(age);
}
 public User getUser(Long id) {return userRepository.findById(id).orElse(null);}
    public User createUser(User user) {return userRepository.save(user);}
}
