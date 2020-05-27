package ru.metelev.services;

import java.util.Set;
import ru.metelev.model.Owner;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
