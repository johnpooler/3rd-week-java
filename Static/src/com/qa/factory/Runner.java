package com.qa.factory;

public class Runner {

	public static void main(String[] args) {

		Box box = new Box(20);
		Box crate = new Box(50);
		Box cage = new Box(280);
		
		
		for (Box item : Box.boxes) {
			System.out.println(item.getVolume());

		}

		

	}

}
