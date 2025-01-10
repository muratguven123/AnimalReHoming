package com.animalHoming.AnimalReHoming.Model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private Integer password;
    private String role;
    private String contact;
    @OneToMany(mappedBy = "user")
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private List<Reward> rewards;
    @OneToMany(mappedBy = "user")
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private List<Animal> animals;
    @OneToMany(mappedBy = "user")
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private List<Shelter> shelters;
    @OneToMany(mappedBy = "user")
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private List<Careteker> caretakers;

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Careteker> getCaretakers() {
        return caretakers;
    }

    public void setCaretakers(List<Careteker> caretakers) {
        this.caretakers = caretakers;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Shelter> getShelters() {
        return shelters;
    }

    public void setShelters(List<Shelter> shelters) {
        this.shelters = shelters;
    }
}
