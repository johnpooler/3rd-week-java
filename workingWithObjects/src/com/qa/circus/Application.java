package com.qa.circus;

public class Application {
	public static void main(String[] args) {

		Elephant dumbo = new Elephant("asian","white",0);
		Elephant nelly = new Elephant("african", "grey", 4);
		Elephant harry= new Elephant("Thai", "black", 4);
		//Ctrl +Space
		Elephant boy= new E
		
		nelly.legs = 8;
		System.out.println(dumbo.colour);
		System.out.println(nelly.colour);
		System.out.println(dumbo.legs);
		System.out.println(nelly.legs);
		System.out.println(dumbo.hair);
		System.out.println(nelly.hair);
		System.out.println(dumbo.species);
		
		dumbo.haveMudBath();
		System.out.println("mudbath: dumbo is now " + dumbo.colour);
		
		dumbo.getPainted("purple");
		System.out.println("paintshop: dumbo is now " + dumbo.colour);
		
		nelly.countryBirth("botswana");
		System.out.println("nelly is from " + nelly.country);
		
		
		
		

	}

}