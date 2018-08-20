package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars extends PlanetState{
	
	private StateMars() {
		super("Mars");
	}
	
	private static class StateMarsHolder {
		private static final StateMars INSTANCE = new StateMars();
	}
	
	public static StateMars getInstance() {
		return StateMarsHolder.INSTANCE;
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
