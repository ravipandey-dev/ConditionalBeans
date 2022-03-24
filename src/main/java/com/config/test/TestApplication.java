package com.config.test;

import com.config.test.service.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	@Autowired
	Animal animal;
	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);
	}

	public void test(){
		animal.eat();
	}

}
