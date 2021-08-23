package com.digitalinnovationone.personapi.controllers;

import com.digitalinnovationone.personapi.entities.Person;
import com.digitalinnovationone.personapi.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public String createPerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);

    }
}
