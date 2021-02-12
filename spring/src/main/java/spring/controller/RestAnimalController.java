package spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.model.Animal;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class RestAnimalController {
    private final Animal animal;

    @PostMapping(value = "/jsonAnimal")
    public Animal getJsonAnimal(@Valid @RequestBody Animal clientAnimal, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return animal;
        }
        return clientAnimal;
    }
}
