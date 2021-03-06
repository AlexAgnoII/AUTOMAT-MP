package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;

public class StateEarth_E extends PlanetState{

	protected StateEarth_E() {
		super("Earth E", PlanetState.EARTH);
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 7;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateEarth_E_Holder {
		private static final StateEarth_E INSTANCE = new StateEarth_E();
	}
	
	public static StateEarth_E getInstance() {
		return StateEarth_E_Holder.INSTANCE;
	}

	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -  ");
		System.out.println("Human    |     -  ");
		System.out.println("Lion     |     -  ");
		System.out.println("Cow      |     -  ");
		System.out.println("         |    Grain");
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
			
			case 7: newPlanetState = StateMars_B.getInstance(); break;
			default: System.out.println("DEAD (Earth E)");
		}
		
		return newPlanetState;
	}
	

}
