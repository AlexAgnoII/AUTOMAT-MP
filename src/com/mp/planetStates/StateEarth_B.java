package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateEarth_B extends PlanetState{

	
	private StateEarth_B() {
		super("Earth B");
	}
	
	private static class StateEarth_B_Holder {
		private static final StateEarth_B INSTANCE = new StateEarth_B();
	}
	
	public static StateEarth_B getInstance() {
		return StateEarth_B_Holder.INSTANCE;
	}
	
	@Override
	public void showCurrentAndOtherPlanet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPossibleMoves() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public PlanetState nextPlanet(int input) {
		return null;
		// TODO Auto-generated method stub
		
	}


}
