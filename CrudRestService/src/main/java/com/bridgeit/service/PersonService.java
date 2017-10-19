package com.bridgeit.service;

import java.util.List;
import com.bridgeit.model.Person;

public interface PersonService {

	Person findById(int id);

	Person findByName(String name);

	void savePerson(Person person);

	void updatePerson(Person person);

	void deletePersonById(int id);

	List<Person> findAllPersons();

}
