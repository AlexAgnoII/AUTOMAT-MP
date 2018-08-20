package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars extends PlanetState{
	
	private StateMars() {
		super("Mars", "Mars");
	}
	
	private static class StateMarsHolder {
		private static final StateMars INSTANCE = new StateMars();
	}
	
	public static StateMars getInstance() {
		return StateMarsHolder.INSTANCE;
	}
	
	
	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -  ");
		System.out.println("Human    |     -  ");
		System.out.println("  -      |    Lion");
		System.out.println("  -      |    Cow");
		System.out.println("Grain    |     -  ");
		
	}


	public void showPossibleMoves() {
		System.out.println("1 - Cow");
		System.out.println("2 - Lion");
		System.out.println("3 - Cow Lion");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1: newPlanetState = StateEarth_A.getInstance(); 
			        break;
			case 2: newPlanetState = StateEarth_B.getInstance();
			        break;
			case 3: break;
			default: System.out.println("Wrong input! (Mars state)");
			        
		}
		
		return newPlanetState;
		
	}




}
