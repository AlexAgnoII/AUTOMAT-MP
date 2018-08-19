package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;

public class StateEarth_A extends PlanetState{
	
	private StateEarth_A() {
		super();
	}
	
	private static class StateEarth_A_Holder {
		private static final StateEarth_A INSTANCE = new StateEarth_A();
	}
	public static StateEarth_A getInstance() {
		return StateEarth_A_Holder.INSTANCE;
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
