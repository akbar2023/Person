package fr.formation.people.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import fr.formation.people.entities.Address;

public interface AddressJpaRepository extends CrudRepository<Address, Long> {

}
