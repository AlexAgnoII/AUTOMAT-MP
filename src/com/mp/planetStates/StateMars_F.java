package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;

public class StateMars_F extends PlanetState{
	
	protected StateMars_F() {
		super("Mars F", PlanetState.MARS);
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 7;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateMars_F_Holder {
		private static final StateMars_F INSTANCE = new StateMars_F();
	}
	
	public static StateMars_F getInstance() {
		return StateMars_F_Holder.INSTANCE;
	}

	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Human");
		System.out.println("Lion     |     -");
		System.out.println("  -      |    Cow");
		System.out.println("  -      |    Grain");
	}

	@Override
	public void showPossibleMoves() {
		System.out.println("1 - Human        |   5 - Human Cow");
		System.out.println("2 - Cow          |   6 - Human Grain");
		System.out.println("3 - Grain        |   7 - Cow Grain");
		System.out.println("4 - Human Human  |   ");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1: System.out.println(GameMessages.BADEND_2); 
					System.out.println(GameMessages.BADEND_4);
					break;
	       
			case 4: System.out.println(GameMessages.BADEND_4);
	        		break;
	        
			case 3:
			case 6: System.out.println(GameMessages.BADEND_2);       
	        		break;
			case 2: newPlanetState = StateEarth_F.getInstance(); break;
			case 5: newPlanetState = StateEarth_G.getInstance(); break;
			case 7: newPlanetState = StateEarth_D.getInstance(); break;
			default: System.out.println("DEAD (Mars F)");
		}
		
		return newPlanetState;
	}
	
	
}
