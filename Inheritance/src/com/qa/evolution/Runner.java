package com.qa.evolution;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		BlackMamba kobe = new BlackMamba();
		kobe.bite();
		kobe.getLength();
		RattleSnake leBron=new RattleSnake();
		leBron.bite();
		leBron.getLength();
		
		Snake a= (Snake) kobe;
		Snake b= (Snake) leBron;
		ArrayList<Snake>snakes=new ArrayList<Snake>();
		snakes.add(a);
		snakes.add(b);
		RattleSnake stillJames =(RattleSnake) b;
//		RattleSnake notJames =(RattleSnake) a;  ERROR
		
		
		
		
		
		
		
	}

}