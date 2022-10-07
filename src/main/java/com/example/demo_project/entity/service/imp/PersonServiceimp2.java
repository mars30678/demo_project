package com.example.demo_project.entity.service.imp;

import com.example.demo_project.entity.Person;
import com.example.demo_project.entity.service.ifs.PersonService;

public class PersonServiceimp2  implements PersonService{
	@Override
	public Person getPersonInfo(String id) {
		Person person = new Person();
		 person.setAge(5);
		 person.setCity("japan");
		 person.setId(id);
		 person.setName("mars");
		return person;
	}
	public void printPersonAttributes(Person person) {
		System.out.println(person.getName());
		System.out.println(person.getId());
		System.out.println(person.getAge());
		System.out.println(person.getCity());
       	}
}
