package com.config.test;

import com.config.test.service.Animal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	Animal animal;

	@Test
	public void getAnimal() {
		animal.eat();
	}
}
