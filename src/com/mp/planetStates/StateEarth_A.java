package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateEarth_A extends PlanetState{
	
	private StateEarth_A() {
		super("Earth A", PLANETState.EARTH);
	}
	
	private static class StateEarth_A_Holder {
		private static final StateEarth_A INSTANCE = new StateEarth_A();
	}
	public static StateEarth_A getInstance() {
		return StateEarth_A_Holder.INSTANCE;
	}
	
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -  ");
		System.out.println("Human    |     -  ");
		System.out.println("  -      |    Lion");
		System.out.println("Cow      |     -  ");
		System.out.println("Grain    |     -  ");
	}

	public void showPossibleMoves() {
		System.out.println("1 - Human          | 5 - Human Cow");
		System.out.println("2 - Cow            | 6 - Human Grain");
		System.out.println("3 - Grain          | 7 - Cow Grain");
		System.out.println("4 - Human Human");
	}

	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 2: newPlanetState = StateMars.getInstance(); break;
			case 5: newPlanetState = StateMars_A.getInstance(); break;
			case 7: newPlanetState = StateMars_B.getInstance(); break;
			default: System.out.println("DEAD (Earth A)");
		}
			
		return newPlanetState;
	}


}
