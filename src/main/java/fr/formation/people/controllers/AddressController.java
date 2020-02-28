package fr.formation.people.controllers;

import javax.validation.Valid;

import fr.formation.people.entities.AddressLite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.formation.people.dtos.AddressCreateDto;
import fr.formation.people.dtos.AddressDto;
import fr.formation.people.entities.Address;
import fr.formation.people.services.AddressService;
import fr.formation.people.services.AddressServiceImpl;


@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	private final AddressService service;
	
	public AddressController(AddressService service) {
		this.service = service;
	}

	@CrossOrigin
	@PostMapping
	public void create(@RequestBody @Valid AddressCreateDto dto) {
		System.out.println(dto);
		service.create(dto);
	}

	@CrossOrigin
	@GetMapping("/{id}")
	public AddressDto get(@PathVariable Long id) {
		AddressDto addressDto = new AddressDto();
		Address address = service.get(id).get();
		addressDto.setStreet(address.getStreet());
		addressDto.setZipCode(address.getZipCode());
		addressDto.setCity(address.getCity());
		addressDto.setCountry(address.getCountry());
		return addressDto;
	}

	@CrossOrigin
	@GetMapping("/all")
	public Iterable<AddressLite> getAll() {
		return service.getAll();
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		
	}

}
