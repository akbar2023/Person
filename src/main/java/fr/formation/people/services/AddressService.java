package fr.formation.people.services;

import java.util.Optional;

import fr.formation.people.dtos.AddressCreateDto;
import fr.formation.people.entities.Address;
import fr.formation.people.entities.AddressLite;

public interface AddressService {
	
	void create(AddressCreateDto dto);

	Iterable<AddressLite> getAll();

	Optional<Address> get(Long id);

}
