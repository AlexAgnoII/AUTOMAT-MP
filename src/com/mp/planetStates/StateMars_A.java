package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars_A extends PlanetState{

	protected StateMars_A() {
		super("Mars A", PLANETState.MARS);
	}
	
	private static class StateMars_A_Holder {
		private static final StateMars_A INSTANCE = new StateMars_A();
	}
	
	public static StateMars_A getInstance() {
		return StateMars_A_Holder.INSTANCE;
	}


	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("Human    |     -  ");
		System.out.println("  -      |    Lion");
		System.out.println("  -      |    Cow");
		System.out.println("Grain    |     -  ");
	}


	public void showPossibleMoves() {
		System.out.println("1 - Human     |  4 - Human Cow");
		System.out.println("2 - Cow       |  5 - Human Lion");
		System.out.println("3 - Lion      |  6 - Cow Lion");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 4: newPlanetState = StateEarth_A.getInstance(); break;
			case 5: newPlanetState = StateEarth_B.getInstance(); break;
			case 6: newPlanetState = StateEarth_C.getInstance(); break;
			default: System.out.println("DEAD (Mars A)");
		}
		
		return newPlanetState;
	}
	
}
