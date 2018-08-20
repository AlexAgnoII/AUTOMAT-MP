package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;

public class StateMars_H extends PlanetState {

	protected StateMars_H() {
		super("Mars H", PlanetState.MARS);
	}
	
	private static class StateMars_H_Holder {
		private static final StateMars_H INSTANCE = new StateMars_H();
	}
	
	public static StateMars_H getInstance() {
		return StateMars_H_Holder.INSTANCE;
	}

	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("Human    |     -  ");
		System.out.println("  -      |    Lion");
		System.out.println("  -      |    Cow");
		System.out.println("  -      |    Grain");
	}

	@Override
	public void showPossibleMoves() {
		System.out.println("1 - Human         |    6 - Human Cow");
		System.out.println("2 - Lion          |    7 - Human Grain");
		System.out.println("3 - Cow           |    8 - Lion Cow");
		System.out.println("4 - Grain         |    9 - Lion Grain");
		System.out.println("5 - Human Lion    |   10 - Cow Grain");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 6: newPlanetState = StateEarth_H.getInstance(); break;
			case 8: newPlanetState = StateEarth_G.getInstance(); break;
			default: System.out.println("DEAD (Mars H)");
		}
		
		return newPlanetState;
	}

}
