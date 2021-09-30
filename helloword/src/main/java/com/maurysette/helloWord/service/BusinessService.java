package com.maurysette.helloWord.service;

import org.springframework.stereotype.Component;

import com.maurysette.helloWord.model.HelloWorld;

@Component
public class BusinessService {
	public HelloWorld getHelloWorld() {
		HelloWorld helloworld = new HelloWorld();
		return helloworld;
		
	}
}
