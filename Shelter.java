package com.animalHoming.AnimalReHoming.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "shelter")
@Data
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private Integer capacity;

    @OneToMany(mappedBy = "shelter")
    private List<Animal> animals;

    @OneToMany(mappedBy = "shelter")
    private List<Careteker> caretakers;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Careteker> getCaretakers() {
        return caretakers;
    }

    public void setCaretakers(List<Careteker> caretakers) {
        this.caretakers = caretakers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}