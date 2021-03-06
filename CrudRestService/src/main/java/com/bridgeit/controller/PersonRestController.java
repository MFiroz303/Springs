package com.bridgeit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.model.Person;
import com.bridgeit.service.PersonService;

@RestController
public class PersonRestController {


	@Autowired
	PersonService personService;

	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person> findById(@PathVariable("id") int id) {
		Person person = personService.findById(id);
		if (person == null) {
			return new ResponseEntity<Person>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Person>(person, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/person/{name}", method = RequestMethod.GET)
	public ResponseEntity<Person> findByName(@PathVariable("name") String name) {
		Person person = personService.findByName(name);
		if (person == null) {
			return new ResponseEntity<Person>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Person>(person, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Void> saveUser(@RequestBody Person person) {
		personService.savePerson(person);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Void> updateUser(@RequestBody Person person) {
		personService.updatePerson(person);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletePersonById(@PathVariable("id") int id) {
		personService.deletePersonById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<Person>> findAllPersons() {
		List<Person> list = personService.findAllPersons();
		
		if (list == null) {
			return new ResponseEntity<List<Person>>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<Person>>(list, HttpStatus.OK);
		}
	}
}
