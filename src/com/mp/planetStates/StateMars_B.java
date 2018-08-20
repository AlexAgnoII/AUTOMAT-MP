package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars_B extends PlanetState{

	protected StateMars_B() {
		super("Mars B", PLANETState.MARS);
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 6;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateMars_B_Holder {
		private static final StateMars_B INSTANCE = new StateMars_B();
	}
	
	public static StateMars_B getInstance() {
		return StateMars_B_Holder.INSTANCE;
	}


	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -");
		System.out.println("Human    |     -  ");
		System.out.println("  -      |    Lion");
		System.out.println("  -      |    Cow");
		System.out.println("  -      |    Grain");
	}


	public void showPossibleMoves() {
		System.out.println("1 - Lion     |  4 - Lion Cow");
		System.out.println("2 - Cow      |  5 - Lion Grain");
		System.out.println("3 - Grain    |  6 - Cow Grain");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1: System.out.println(GameMessages.BADEND_4);break;
			case 3: System.out.println(GameMessages.BADEND_3);break;
			
			case 2: newPlanetState = StateEarth_H.getInstance(); break;
			case 4: newPlanetState = StateEarth_E.getInstance(); break;
			case 5: newPlanetState = StateEarth_B.getInstance(); break;
			case 6: newPlanetState = StateEarth_A.getInstance(); break;
			default: System.out.println("DEAD! (Mars B)");
		}
		
		return newPlanetState;
	}
	
}
