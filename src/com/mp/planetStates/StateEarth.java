package com.mp.planetStates;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateEarth extends PlanetState{

	private StateEarth() {
		super();
	}
	
	private static class StateEarthHolder {
		private static final StateEarth INSTANCE = new StateEarth();
	}
	
	public static StateEarth getInstance() {
		return StateEarthHolder.INSTANCE;
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
