package com.qa.petstore;

public class Runner {

	public static void main(String[] args) {
		Cat cat= new Cat("Mya");
		Cat stray=new Cat();
		
		System.out.println(cat.getName());
		System.out.println(stray.getName());
		

	}

}
