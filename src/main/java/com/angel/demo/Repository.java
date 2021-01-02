package com.angel.demo;

import java.util.Hashtable;
import java.util.Map;

public class Repository {

	static Map<String, Person> persons = new Hashtable<>();
	
	static {
		persons.put("Сергей", new Person("Сергей", 26));
		persons.put("Артем", new Person("Артем", 34));
		persons.put("Виктор", new Person("Виктор", 29));
	}
	
	public Person personByName(String name) {
		return persons.get(name);
	}
	
	public Person addPerson(Person p) {
		persons.put(p.getName(), p);
		return p;
	}
	
}
