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
		System.out.println("我是" + bird.getName()+ "傻鳥"+ bird.getAge() + "歲我活好久");
		active.printAll(bird);
	}
	@Test
	public void activeTesr() {
		
	}
}
