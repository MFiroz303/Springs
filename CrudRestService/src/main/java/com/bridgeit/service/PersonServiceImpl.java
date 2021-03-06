package com.bridgeit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.DAO.PersonDao;
import com.bridgeit.model.Person;

public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao personDao;
	public Person findById(int id) {
		return personDao.findById(id);
	}

	
	public Person findByName(String name) {
		return personDao.findByName(name);
	}

	
	public void savePerson(Person person) {
		personDao.savePerson(person);
	}

	
	public void updatePerson(Person person) {
		personDao.updatePerson(person);
	}

	
	public void deletePersonById(int id) {
		personDao.deletePersonById(id);
	}

	
	public List<Person> findAllPersons() {
		return personDao.findAllPersons();
	}

}
