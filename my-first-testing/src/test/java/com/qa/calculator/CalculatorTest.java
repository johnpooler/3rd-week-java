package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	@Before
	public void setUp() {
		calculator=new Calculator();
	}
	
	
	
	
	
	
	
	
	@Test
	public void sumTest() {
		Calculator calculator= new Calculator();
		assertEquals(13, calculator.addition(5, 8));
		
		
		String str="apple";{
			System.out.println(str.substring(1,4));
			System.out.println(str.length());}
		
	}
	@Test
	public void subtractionTest() {
		Calculator calculator= new Calculator();
		assertEquals(-40, calculator.substraction(20, 60));
		
	}
	@Test
	public void multiplicationTest() {
		Calculator calculator= new Calculator();
		assertEquals(-40, calculator.multiplication(-20, 2));
		
	}
	@Test
	public void divisionTest() {
		Calculator calculator= new Calculator();
		assertEquals(24, calculator.division(-480, -20));
		
	}
	
	
	

}
