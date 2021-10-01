package com.maurysette.helloWord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maurysette.helloWord.service.BusinessService;

@SpringBootTest
class HellowordApplicationTests {

    @Autowired
    private BusinessService bs;

	@Test
	void contextLoads() {
	}
	@Test
	void testGetHelloWorld(){
		String result = bs.getHelloWorld().getValue();

        assertEquals("hello world !", result);
		
	}

}
