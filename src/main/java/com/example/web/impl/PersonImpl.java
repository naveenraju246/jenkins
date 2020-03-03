package com.example.web.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.web.PersonInterface;
import com.example.web.model.Person;

@Component
public class PersonImpl implements PersonInterface {

	@Override
	public List<Person> getpersons() {
		List<Person> personList = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setPersonid(1);
		p1.setName("Chandana");
		p1.setAge(20);
		personList.add(p1);
		Person p2 = new Person();
		p2.setPersonid(2);
		p2.setName("Naveen");
		p2.setAge(20);
		personList.add(p2);
		return personList;
	}

}
