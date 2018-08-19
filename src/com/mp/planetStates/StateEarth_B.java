package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;

public class StateEarth_B extends PlanetState{

	
	private StateEarth_B() {
		super();
	}
	
	private static class StateEarth_B_Holder {
		private static final StateEarth_B INSTANCE = new StateEarth_B();
	}
	
	public static StateEarth_B getInstance() {
		return StateEarth_B_Holder.INSTANCE;
	}
	
	@Override
	public void showCurrentPlanet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showOtherPlanet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nextPlanet(int input) {
		// TODO Auto-generated method stub
		
	}

}
