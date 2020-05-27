package ru.metelev.services;

import java.util.Set;
import ru.metelev.model.Vet;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
