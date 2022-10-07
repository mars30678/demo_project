package com.example.demo_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.entity.Person;
import com.example.demo_project.entity.service.ifs.PersonService;
import com.example.demo_project.entity.service.imp.Eagle;
import com.example.demo_project.entity.service.imp.PersonServiceimp;
import com.example.demo_project.entity.service.imp.PersonServiceimp2;

@SpringBootApplication
public class DemoProjectApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
		
		
		
//		PersonServiceimp personservice = new PersonServiceimp();
//		Person psr = personservice.getPersonInfo("AAA");
//		personservice.printPersonAttributes(psr);
		//========================
//		PersonServiceimp personservice = new PersonServiceimp() ;	
//		  Person psr = personservice.getPersonInfo("AAA") ;
//		  personservice.printPersonAttributes(psr);
		//===================================
//	  Eagle bird = new Eagle();
//	  Bird aaa = bird.fly("yoro", 6);
//	  bird.printAll(aaa);

	}

}
