package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars_C extends PlanetState{

	protected StateMars_C() {
		super("Mars C", PLANETState.MARS);
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 4;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateMars_C_Holder {
		private static final StateMars_C INSTANCE = new StateMars_C();
	}
	
	public static StateMars_C getInstance() {
		return StateMars_C_Holder.INSTANCE;
	}

	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Human");
		System.out.println("Lion     |     -");
		System.out.println("  -      |    Cow");
		System.out.println("Grain    |     -");
	}

	public void showPossibleMoves() {
		System.out.println("1 - Human");
		System.out.println("2 - Cow");
		System.out.println("3 - Human Human");
		System.out.println("4 - Human cow");
		
	}

	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1: System.out.println(GameMessages.BADEND_2); 
	        		break;
			case 2: newPlanetState = StateEarth_D.getInstance(); break;
			case 3: newPlanetState = StateEarth_B.getInstance(); break;
			case 4: newPlanetState = StateEarth_C.getInstance(); break;
			default: System.out.println("DEAD (Mars C)");
		}
		
		return newPlanetState;
	}

}
