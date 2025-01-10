package com.animalHoming.AnimalReHoming.Model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "caretaker")
@Data
public class Careteker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contact;
    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
