package com.qa.birdwatching;

public class Runner {

	public static void main(String[] args) {
		Bird parrot= new Bird();
		parrot.fly();
		System.out.println(parrot.getAltitude());
		
		Penguin pingu= new Penguin();
		pingu.fly();
		
		Bird bird= new Penguin();
		bird.fly();
		
		
		System.out.println(Math.PI);
	}

}
