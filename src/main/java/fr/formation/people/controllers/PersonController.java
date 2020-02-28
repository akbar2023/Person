package fr.formation.people.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.people.dtos.PersonCreateDto;
import fr.formation.people.dtos.PersonDto;

// Définir un ensemble de endpoints
// pour un type de ressource (Person)

@RestController  // Ceci est un controller, tiens en compte
@RequestMapping("/persons")
// http://localhost:8082/persons
public class PersonController {
	
	// GET, POST, DELETE
	
	// GET http://localhost:8082/persons/123
	// 123 = path variable, variable de chemin
	@GetMapping("/{id}")
	public PersonDto get(@PathVariable Long id) {
		PersonDto person = new PersonDto();
		person.setFirstName("Akbar");
		person.setLastName("KHAN");
		return person;
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Long id) {
		return "Person with id=" + id + " was deleted successfully";
	}
	
	// @RequestBody = extraire et convertir le JSON du corps (body)
	// de la requête HTTP vers une instance de PersonCreateDto
	// @Valid : Cascader la validation sur le DTO
	@PostMapping
	public void create(@RequestBody @Valid PersonCreateDto dto) {
		System.out.println(dto);
	}
}
