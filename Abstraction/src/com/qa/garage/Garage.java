package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	public static void main(String[] args) {
//		Vehicle vehicle = new Vehicle(); wont work as Vehicle is abstract
		Car lambo = new Car("red", true, 299);
		Motorbike honda = new Motorbike("blue", 4);
		Motorbike kawasaki=new Motorbike("white", 5);
		Train thomas = new Train("green", 37);
		
	
		System.out.println("your car has " + lambo.getGas() + " gallons of gas");
		honda.move();
		kawasaki.trick();
//		System.out.println(honda.trick());
		honda.bill();
		System.out.println(lambo.getEngineSize());
		
		String str ="jbvjibvej bve";
		
		
		ArrayList<Vehicle> modesOfTransport= new ArrayList<Vehicle>(); //list for storing vehicles
		
		modesOfTransport.add(lambo);
		modesOfTransport.add(kawasaki);
		modesOfTransport.add(honda);
		modesOfTransport.add(thomas);
		modesOfTransport.add(new Car("gold", false, 399));
		
		for(Vehicle potato : modesOfTransport) {
			System.out.println(potato.getColour());
		}
		modesOfTransport.stream().forEach(item-> System.out.println("the cost for "+item+" is "+ item.bill()));
		
		modesOfTransport.remove(honda);
		
		

		
		
		
		
		Vehicle smart = new Car("yellow", false, 20);
		smart.move();
		
		

	}

}
