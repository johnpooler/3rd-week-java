package com.qa.garage;

public class Car extends Vehicle {
	private boolean radio;
	private int engineSize;

	public Car(String colour, boolean radio,int engineSize) {
		super(colour);
		this.radio = radio;
		this.engineSize= engineSize;
		
	}

	
	
	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	
	

	public float bill() {
		if (radio) {
			return 1000.99f;
		}
		else {
			return 509.00f;
		}
	}



	private int gas = 100;

	
	public void move() {
		this.speed += 5;
		System.out.println("bruuuum");
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

}