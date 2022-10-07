package com.example.demo_project.entity.service.imp;
 
import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.entity.service.ifs.PersonService;
 @Service
public class PersonServiceimp implements PersonService {

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
//	public String getPersonId(Person person) {
//		return person.getId();
//	}
//	public String getPersonName(Person person) {
//		return person.getName();
//	}
//	public int getPersonAge(Person person) {
//		return person.getAge();
//	}
//	public String getPersonCity(Person person) {
//		return person.getCity();
//	}
//    public String getPersonId() {
//    	String str = "aaa" ;
//    	return str ; 
//    }
}
