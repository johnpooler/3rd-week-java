package com.qa.petstore;

public class Cat {
	private String name;
	
	public Cat(String name) {//constructor
		this.name=name;
	}

	public Cat () {
			this.name="stray piece of trash";
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
