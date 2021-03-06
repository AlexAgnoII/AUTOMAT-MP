package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;

public class StateEarth_H extends PlanetState {

	protected StateEarth_H() {
		super("Earth  H", PlanetState.EARTH);
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 4;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateEarth_H_Holder {
		private static final StateEarth_H INSTANCE = new StateEarth_H();
	}

	
	public static StateEarth_H getInstance() {
		return StateEarth_H_Holder.INSTANCE;
	}
	
	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -");
		System.out.println("Human    |     -  ");
		System.out.println("  -      |    Lion");
		System.out.println("Cow      |     -");
		System.out.println("  -      |    Grain");
	}

	@Override
	public void showPossibleMoves() {
		System.out.println("1 - Human");
		System.out.println("2 - Cow");
		System.out.println("3 - Human Human");
		System.out.println("4 - Human Cow");
		
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1: System.out.println(GameMessages.BADEND_2); 
			        break;
			case 2: newPlanetState = StateMars_B.getInstance(); break;
			case 3: newPlanetState = StateMars_E.getInstance(); break;
			case 4: newPlanetState = StateMars_H.getInstance(); break;
			default: System.out.println("DEAD (Earth H)");
		}
			
		return newPlanetState;
	}

}
