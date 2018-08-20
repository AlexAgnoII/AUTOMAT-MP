package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateEarth_B extends PlanetState{

	
	private StateEarth_B() {
		super("Earth B", PLANETState.EARTH);
		
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 7;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateEarth_B_Holder {
		private static final StateEarth_B INSTANCE = new StateEarth_B();
	}
	
	public static StateEarth_B getInstance() {
		return StateEarth_B_Holder.INSTANCE;
	}
	
	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -  ");
		System.out.println("Human    |     -  ");
		System.out.println("Lion     |     -  ");
		System.out.println("  -      |    Cow");
		System.out.println("Grain    |     -  ");
	}

	public void showPossibleMoves() {
		System.out.println("1 - Human        | 5 - Human Lion");
		System.out.println("2 - Lion         | 6 - Human Grain");
		System.out.println("3 - Grain        | 7 - Lion Grain");
		System.out.println("4 - Human Human  | ");
	}
	

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1: 
			case 3:
			case 6: System.out.println(GameMessages.BADEND_1); break;
			case 2: newPlanetState = StateMars.getInstance(); break;
			case 4: newPlanetState = StateMars_C.getInstance(); break;
			case 5: newPlanetState = StateMars_A.getInstance(); break;
			case 7: newPlanetState = StateMars_B.getInstance(); break;
			default: System.out.println("DEAD (Earth B)");
			        
		}
		
		return newPlanetState;
	}


}
