package com.qa.circus;

public class Elephant {
	String species = "asian";
	String colour = "grey";
	String country;
	int legs = 4;
	int hair;

	public void haveMudBath() {
		colour = "brown";
	}

	public void getPainted(String paint) {
		colour = paint;
	}

	public void countryBirth(String place) {
		country = place;
		
	}
	
	/**
	 * This creates an elephant
	 * @param Species:thisis the species
	 * @param Colour colour of the elephant.
	 * @param Legs how many legs.
	 */
	//constructor
	public Elephant(String Species, String Colour, int Legs) {
		System.out.println("an Elephant is born...");
		this.species=species;
		this.colour=colour;
		this.legs=legs;
		
	}

}
