package fr.formation.people.services;

import java.util.Optional;

import fr.formation.people.entities.AddressLite;
import fr.formation.people.repositories.AddressLiteJpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.people.dtos.AddressCreateDto;
import fr.formation.people.entities.Address;
import fr.formation.people.repositories.AddressJpaRepository;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressJpaRepository repository;
	private AddressLiteJpaRepository liteRepository;

    public AddressServiceImpl(AddressJpaRepository repository, AddressLiteJpaRepository liteRepository) {
        this.repository = repository;
        this.liteRepository = liteRepository;
    }

    @Override
    public void create(AddressCreateDto dto) {
        //Grace à la validation du controller on fait confiance à la qualité des données.
        // Convertir AddressCreateDto en Address (entité)
        // En création pas l'id, il est attribué par la bdd

        Address address = new Address();
        address.setStreet(dto.getStreet()); // Copy street du dto vers l'entité
        address.setCity(dto.getCity());
        address.setZipCode(dto.getZipCode());
        address.setCountry(dto.getCountry());
        repository.save(address);
    }


    public Optional<Address> get(Long id) {
        Optional<Address> address = repository.findById(id);
        return address;
    }
    

    public Iterable<AddressLite> getAll() {
		return liteRepository.findAll();
    }

}
