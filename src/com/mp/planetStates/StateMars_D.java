package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars_D extends PlanetState{

	protected StateMars_D() {
		super("Mars D", PLANETState.MARS);
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 7;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateMars_D_Holder {
		private static final StateMars_D INSTANCE = new StateMars_D();
	}
	
	public static StateMars_D getInstance() {
		return StateMars_D_Holder.INSTANCE;
	}

	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Lion");
		System.out.println("  -      |    Cow");
		System.out.println("Grain    |     - ");
		
	}

	@Override
	public void showPossibleMoves() {
		System.out.println("1 - Human       |  5 - Human Lion ");
		System.out.println("2 - Lion        |  6 - Human Cow");
		System.out.println("3 - Cow         |  7 - Lion Cow");
		System.out.println("4 - Human Human |");
		
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1: System.out.println(GameMessages.BADEND_1);
			case 4: System.out.println(GameMessages.BADEND_3); 
			       break;
			
			case 5: 
			case 2: System.out.println(GameMessages.BADEND_2);
			        break;
			case 3: 
			case 6: System.out.println(GameMessages.BADEND_1); 
			        break;
			case 7: newPlanetState = StateEarth_D.getInstance(); break;
			default: System.out.println("DEAD (Mars D)");
		}
		
		return newPlanetState;
	}

}
