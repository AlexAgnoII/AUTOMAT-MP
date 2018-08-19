package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;

public class StateMars extends PlanetState{
	
	private StateMars() {
		super();
	}
	
	private static class StateMarsHolder {
		private static final StateMars INSTANCE = new StateMars();
	}
	
	public static StateMars getInstance() {
		return StateMarsHolder.INSTANCE;
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
