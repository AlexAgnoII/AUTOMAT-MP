package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;

public class StateEarth_C extends PlanetState {

	protected StateEarth_C() {
		super("Earth C", PlanetState.EARTH);
		
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 10;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateEarth_C_Holder {
		private static final StateEarth_C INSTANCE = new StateEarth_C();
	}
	public static StateEarth_C getInstance() {
		return StateEarth_C_Holder.INSTANCE;
	}

	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("Human    |     -  ");
		System.out.println("Lion     |     -  ");
		System.out.println("Cow      |     -  ");
		System.out.println("Grain    |     -  ");
	}

	public void showPossibleMoves() {
		System.out.println("1 - Human      |  6 - Human Cow ");
		System.out.println("2 - Lion       |  7 - Human Grain");
		System.out.println("3 - Cow        |  8 - Lion Cow");
		System.out.println("4 - Grain      |  9 - Lion Grain");
		System.out.println("5 - Human Lion | 10 - Cow Grain");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		
		switch(input) {
			case 1: System.out.println(GameMessages.BADEND_3);
			        System.out.println(GameMessages.BADEND_4);
			        break;
			case 2: System.out.println(GameMessages.BADEND_2);
					System.out.println(GameMessages.BADEND_4);
				    break;
			case 4: System.out.println(GameMessages.BADEND_1);
			        System.out.println(GameMessages.BADEND_3);
			        break;
			case 5: System.out.println(GameMessages.BADEND_4);
			        break;
			case 7: System.out.println(GameMessages.BADEND_3);
			        break; 
			case 9: System.out.println(GameMessages.BADEND_2);
					break;
			case 3: 
			case 10: System.out.println(GameMessages.BADEND_1);
			         break;
			
			case 6: newPlanetState = StateMars_C.getInstance(); break;
			case 8: newPlanetState = StateMars_A.getInstance(); break;
			default: System.out.println("DEAD (Earth C)");
		}
		
		return newPlanetState;
	}
	
}
