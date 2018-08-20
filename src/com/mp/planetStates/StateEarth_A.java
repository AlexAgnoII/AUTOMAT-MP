package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;

public class StateEarth_A extends PlanetState{
	
	private StateEarth_A() {
		super("Earth A");
	}
	
	private static class StateEarth_A_Holder {
		private static final StateEarth_A INSTANCE = new StateEarth_A();
	}
	public static StateEarth_A getInstance() {
		return StateEarth_A_Holder.INSTANCE;
	}
	
	public void showCurrentAndOtherPlanet() {
		
	}

	public void showPossibleMoves() {
		
	}

	public PlanetState nextPlanet(int input) {
		return null;
	}


}
