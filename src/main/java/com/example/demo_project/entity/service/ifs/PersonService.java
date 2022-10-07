package com.example.demo_project.entity.service.ifs;

import com.example.demo_project.entity.Person;

public interface PersonService {
	public Person getPersonInfo(String id); 
//	default Person getPersonInfo2() {       /在介面唯有default才能實作
//		 return new Person();
//	}
}
