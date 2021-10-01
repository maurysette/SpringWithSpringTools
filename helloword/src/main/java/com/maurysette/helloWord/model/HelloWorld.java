package com.maurysette.helloWord.model;


public class HelloWorld {
	String value = "hello world !";
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "HelloWorld [value=" + value + "]";
	}
	

}
