package com.example.demo_project.entity.service.ifs;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
 
public interface Active {
	public Bird fly(String name ,int age); 
	public void printAll(Bird a);
}
