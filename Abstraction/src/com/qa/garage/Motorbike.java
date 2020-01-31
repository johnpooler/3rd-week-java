package com.qa.garage;

public class Motorbike extends Vehicle{
	private int stickers;
	
	public Motorbike(String colour, int stickers) {
		super(colour);
		this.stickers=stickers;
		
		
	}
	public float bill() {
		if (stickers>=5) {
			return 100.99f;
		}
		else {
			return 5.00f;
		}
	}
	
	
	
	
	public int getStickers() {
		return stickers;
	}

	public void setStickers(int stickers) {
		this.stickers = stickers;
	}




	@Override
	public void move() {
		this.speed+=3;
		System.out.println("miooooooo");
	}
	public void trick() {
		this.altitude+=2;
		System.out.println("that was legitness");
	}
	
}
