package com.bridgeit.DAO;

import java.util.List;
import com.bridgeit.model.Person;

public interface PersonDao {

	Person findById(int id);

	Person findByName(String name);

	void savePerson(Person person);

	void updatePerson(Person person);

	void deletePersonById(int id);

	List<Person> findAllPersons();

}
