package com.animalHoming.AnimalReHoming.Contorller;

import com.animalHoming.AnimalReHoming.Model.Careteker;
import com.animalHoming.AnimalReHoming.service.CaretakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("careteker")
public class CaretakerController {
    @Autowired
    private CaretakerService caretakerService;

    @GetMapping("{/id}")
    public Careteker getCaretaker(@PathVariable Long id) {
        return caretakerService.findById(id);
    }
    @PostMapping
    public Careteker addCaretaker(@RequestBody Careteker caretaker) {
        return caretakerService.save(caretaker);
    }
    @PutMapping
    public void updateCaretaker(@RequestBody Careteker caretaker) throws Exception {
        Careteker caretakerUpdate = caretakerService.findById(caretaker.getId());
        if (caretakerUpdate != null) {
            caretakerUpdate.setName(caretaker.getName());
            caretakerUpdate.setId(caretaker.getId());
            caretakerUpdate.setUser(caretaker.getUser());
            caretakerUpdate.setShelter(caretaker.getShelter());
            caretakerUpdate.setContact(caretaker.getContact());
            caretakerService.save(caretakerUpdate);
        }else{
            throw new Exception("NOT POSSİBLE");
        }


    }

}
