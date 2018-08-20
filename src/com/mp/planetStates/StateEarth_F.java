package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateEarth_F extends PlanetState{

	protected StateEarth_F() {
		super("Earth F", PLANETState.EARTH);
		// TODO Auto-generated constructor stub
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 3;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateEarth_F_Holder {
		private static StateEarth_F INSTANCE = new StateEarth_F();
	}

	public static StateEarth_F getInstance() {
		return StateEarth_F_Holder.INSTANCE;
	}
	
	
	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Human");
		System.out.println("Lion     |     -");
		System.out.println("Cow      |     -");
		System.out.println("  -      |    Grain");
	}

	@Override
	public void showPossibleMoves() {
		System.out.println("1 - Lion ");
		System.out.println("2 - Cow ");
		System.out.println("3 - Lion Cow ");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1: newPlanetState = StateMars_E.getInstance(); break;
			case 2: newPlanetState = StateMars_F.getInstance(); break;
			case 3: newPlanetState = StateMars_G.getInstance(); break;
			default: System.out.println("Something is wrong. (Earth F)");
		}
			
		return newPlanetState;
	}
	
}
