package com.example.demo_project.entity.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;

import com.example.demo_project.entity.service.ifs.Active;
@Service
public class Eagle implements Active {
	
	@Override
	public Bird fly(String name, int age) {
		Bird a = new Bird();
		a.setName(name);;
		a.setAge(age);
		return a ;
	}
	@Override
	public void printAll(Bird a) {
		System.out.println("我是" + a.getName() + "傻鳥" + a.getAge( ) + "歲我活好久");
	
	}
   
	
	
}
