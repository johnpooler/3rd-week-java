package com.qa.garage;

public abstract class Vehicle {
	public abstract void move();

	public int speed = 0;
	public int altitude = 1;

	
	private String colour;

	public Vehicle(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public abstract float bill();

}