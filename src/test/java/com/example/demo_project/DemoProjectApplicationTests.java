package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.entity.service.ifs.Active;
import com.example.demo_project.entity.service.imp.Eagle;

@SpringBootTest
class DemoProjectApplicationTests {
	@Autowired
	private Active active ;
	
	@Test
	void contextLoads() {
		Bird bird = active.fly("yoro", 6);
		System.out.println("�ڬO" + bird.getName()+ "�̳�"+ bird.getAge() + "���ڬ��n�[");
		active.printAll(bird);
	}
	@Test
	public void activeTesr() {
		
	}
}
