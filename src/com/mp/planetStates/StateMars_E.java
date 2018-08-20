package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars_E extends PlanetState{
	
	protected StateMars_E() {
		super("Mars E", PLANETState.MARS);
		// TODO Auto-generated constructor stub
	}
	
	private static class StateMars_E_Holder {
		private static final StateMars_E INSTANCE = new StateMars_E();
	}
	
	public static StateMars_E getInstance() {
		return StateMars_E_Holder.INSTANCE;
	}

	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Lion");
		System.out.println("Cow      |     -");
		System.out.println("  -      |    Grain");
	}

	@Override
	public void showPossibleMoves() {
		System.out.println("1 - Human        | 5 - Human Lion");
		System.out.println("2 - Lion         | 6 - Human Grain");
		System.out.println("3 - Grain        | 7 - Lion Grain");
		System.out.println("4 - Human Human  | ");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 2: newPlanetState = StateEarth_A.getInstance(); break;
			case 4: newPlanetState = StateEarth_B.getInstance(); break;
			case 5: newPlanetState = StateEarth_C.getInstance(); break;
			case 7: break;
			default: System.out.println("DEAD (Mars E)");
		}
		
		return newPlanetState;
	}

}
