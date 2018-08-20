package com.mp.planetStates;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateEarth extends PlanetState{

	private StateEarth() {
		super("Earth");
	}
	
	private static class StateEarthHolder {
		private static final StateEarth INSTANCE = new StateEarth();
	}
	
	public static StateEarth getInstance() {
		return StateEarthHolder.INSTANCE;
	}

	public void showCurrentAndOtherPlanet() {
		System.out.println("Current State: " + this.name);
		System.out.println("Current Planet: Earth");
		
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -  ");
		System.out.println("Human    |     -  ");
		System.out.println("Lion     |     -  ");
		System.out.println("Cow      |     -  ");
		System.out.println("Grain    |     -  ");
	}

	public void showPossibleMoves() {
		System.out.println("1 - Human        | 7 - Human Cow");
		System.out.println("2 - Lion         | 8 - Human Grain");
		System.out.println("3 - Cow          | 9 - Lion Cow");
		System.out.println("4 - Grain        | 10 - Lion Grain");
		System.out.println("5 - Human Human  | 11 - Cow Grain");
		System.out.println("6 - Human Lion   |");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1: 
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: 
			case 7: 
			case 8: 
			case 10:
			case 11:break;
			case 9: newPlanetState =  StateMars.getInstance(); 
			        break;
			default: System.out.println("Wrong input! (Earth State");
			        
		}
		
		return newPlanetState;
	}





}
