package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars_E extends PlanetState{
	
	protected StateMars_E() {
		super("Mars E", PLANETState.MARS);
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 7;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateMars_E_Holder {
		private static final StateMars_E INSTANCE = new StateMars_E();
	}
	
	public static StateMars_E getInstance() {
		return StateMars_E_Holder.INSTANCE;
	}

	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Lion");
		System.out.println("Cow      |     -");
		System.out.println("  -      |    Grain");
	}

	@Override
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
			case 2: newPlanetState = StateEarth_F.getInstance(); break;
			case 4: newPlanetState = StateEarth_H.getInstance(); break;
			case 5: newPlanetState = StateEarth_G.getInstance(); break;
			case 7: newPlanetState = StateEarth_D.getInstance(); break;
			default: System.out.println("DEAD (Mars E)");
		}
		
		return newPlanetState;
	}

}
