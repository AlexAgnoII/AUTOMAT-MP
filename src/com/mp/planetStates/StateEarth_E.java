package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;

public class StateEarth_E extends PlanetState{

	protected StateEarth_E() {
		super("Earth E", PlanetState.EARTH);
	}
	
	private static class StateEarth_E_Holder {
		private static final StateEarth_E INSTANCE = new StateEarth_E();
	}
	
	public static StateEarth_E getInstance() {
		return StateEarth_E_Holder.INSTANCE;
	}

	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -  ");
		System.out.println("Human    |     -  ");
		System.out.println("Lion     |     -  ");
		System.out.println("Cow      |     -  ");
		System.out.println("         |    Grain");
	}

	@Override
	public void showPossibleMoves() {
		System.out.println("1 - Human       |  5 - Human Lion ");
		System.out.println("2 - Lion        |  6 - Human Cow");
		System.out.println("3 - Cow         |  7 - Lion Cow");
		System.out.println("4 - Human Human |");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		
		switch(input) {
			case 7: newPlanetState = StateMars_B.getInstance(); break;
			default: System.out.println("DEAD (Earth E)");
		}
		
		return newPlanetState;
	}
	

}
