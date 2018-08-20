package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;

public class StateEarth_C extends PlanetState {

	protected StateEarth_C() {
		super("Earth C", PlanetState.EARTH);
	}
	
	private static class StateEarth_C_Holder {
		private static final StateEarth_C INSTANCE = new StateEarth_C();
	}
	public static StateEarth_C getInstance() {
		return StateEarth_C_Holder.INSTANCE;
	}

	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("Human    |     -  ");
		System.out.println("Lion     |     -  ");
		System.out.println("Cow      |     -  ");
		System.out.println("Grain    |     -  ");
	}

	public void showPossibleMoves() {
		System.out.println("1 - Human      |  6 - Human Cow ");
		System.out.println("2 - Lion       |  7 - Human Grain");
		System.out.println("3 - Cow        |  8 - Lion Cow");
		System.out.println("4 - Grain      |  9 - Lion Grain");
		System.out.println("5 - Human Lion | 10 - Cow Grain");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		
		switch(input) {
			case 6: //newPlanetState = StateMars_C.getInstance(); break;
			case 8: newPlanetState = StateMars_A.getInstance(); break;
			default: System.out.println("DEAD (Earth C)");
		}
		
		return newPlanetState;
	}
	
}
