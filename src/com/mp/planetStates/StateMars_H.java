package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;

public class StateMars_H extends PlanetState {

	protected StateMars_H() {
		super("Mars H", PlanetState.MARS);
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 7;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateMars_H_Holder {
		private static final StateMars_H INSTANCE = new StateMars_H();
		
	}
	
	public static StateMars_H getInstance() {
		return StateMars_H_Holder.INSTANCE;
	}

	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("Human    |     -  ");
		System.out.println("  -      |    Lion");
		System.out.println("  -      |    Cow");
		System.out.println("  -      |    Grain");
	}

	@Override
	public void showPossibleMoves() {
		System.out.println("1 - Human         |    6 - Human Cow");
		System.out.println("2 - Lion          |    7 - Human Grain");
		System.out.println("3 - Cow           |    8 - Lion Cow");
		System.out.println("4 - Grain         |    9 - Lion Grain");
		System.out.println("5 - Human Lion    |   10 - Cow Grain");
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
	         
			case 6: newPlanetState = StateEarth_H.getInstance(); break;
			case 8: newPlanetState = StateEarth_G.getInstance(); break;
			default: System.out.println("DEAD (Mars H)");
		}
		
		return newPlanetState;
	}

}
