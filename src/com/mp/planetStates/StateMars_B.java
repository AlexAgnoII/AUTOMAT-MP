package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars_B extends PlanetState{

	protected StateMars_B() {
		super("Mars B", PLANETState.MARS);
	}
	
	private static class StateMars_B_Holder {
		private static final StateMars_B INSTANCE = new StateMars_B();
	}
	
	public static StateMars_B getInstance() {
		return StateMars_B_Holder.INSTANCE;
	}


	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -");
		System.out.println("Human    |     -  ");
		System.out.println("  -      |    Lion");
		System.out.println("  -      |    Cow");
		System.out.println("  -      |    Grain");
	}


	public void showPossibleMoves() {
		System.out.println("1 - Lion     |  4 - Lion Cow");
		System.out.println("2 - Cow      |  5 - Lion Grain");
		System.out.println("3 - Grain    |  6 - Cow Grain");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 3: //newPlanetState = StateEarth_H.getInstance() break;
			case 4: newPlanetState = StateEarth_E.getInstance(); break;
			case 5: newPlanetState = StateEarth_B.getInstance(); break;
			case 6: newPlanetState = StateEarth_A.getInstance(); break;
			default: System.out.println("Wrong input! (Mars B)");
		}
		
		return newPlanetState;
	}
	
}
