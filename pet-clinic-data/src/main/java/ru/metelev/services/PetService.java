package ru.metelev.services;

import java.util.Set;
import ru.metelev.model.Pet;

public interface PetService {

    Pet findById(Long id);

    Pet findByLastName(String lastName);

    Pet save(Pet owner);

    Set<Pet> findAll();

}
