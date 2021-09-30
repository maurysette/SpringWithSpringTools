package com.maurysette.helloWord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maurysette.helloWord.model.HelloWorld;
import com.maurysette.helloWord.service.BusinessService;

@SpringBootApplication
public class HellowordApplication {
	
	@Autowired
	private BusinessService bs; 
	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
	}
	public void run(String... args) throws Exception{
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}
}
