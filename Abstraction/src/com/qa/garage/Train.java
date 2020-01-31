package com.qa.garage;

public class Train extends Vehicle{
	private int passengers;
	public Train(String colour, int passengers) {
		super(colour);
		this.passengers= passengers;
	
	}
	public float bill() {
		if (passengers>50) {
			return 3.99f;
		}
		else {
			return 1.99f;
		}
	}
	

	public int getPassengers() {
		return passengers;
	}



	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}



	@Override
	public void move() {
		this.speed+=10;
		System.out.println("choooochoooo");
	}
	

}
