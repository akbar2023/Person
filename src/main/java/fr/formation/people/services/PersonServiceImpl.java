package fr.formation.people.services;
import fr.formation.people.dtos.PersonCreateDto;
import fr.formation.people.entities.Person;

public class PersonServiceImpl implements PersonService {

	@Override
	public void create(PersonCreateDto dto) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.setFirstName(dto.getFirstName());
		person.setLastName(dto.getLastName());
		person.setBirthDate(dto.getBirthDate());
		
		System.out.println(person);

	}

}
