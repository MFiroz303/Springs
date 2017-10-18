package com.bridgeit.DAO;

import java.util.List;
import com.bridgeit.model.Person;

public interface PersonDao {

	public void save(Person p);

	public List<Person> list();

}
