package com.mp.planetStates;

import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateEarth_D extends PlanetState{

	protected StateEarth_D() {
		super("Earth D", PLANETState.EARTH);
		
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 6;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateEarth_D_Holder {
		private static final StateEarth_D INSTANCE = new StateEarth_D();
	}
	
	public static StateEarth_D getInstance() {
		return StateEarth_D_Holder.INSTANCE;
	}
	
	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Human");
		System.out.println("Lion     |     -");
		System.out.println("Cow      |     -");
		System.out.println("Grain    |     -");
	}

	@Override
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
			
			case 2: newPlanetState = StateMars_C.getInstance(); break;
			case 4: newPlanetState = StateMars_D.getInstance(); break;
			case 5: newPlanetState = StateMars_E.getInstance(); break;
			case 6: newPlanetState = StateMars_F.getInstance(); break;
			default: System.out.println("DEAD (Earth D)");
		}
			
		return newPlanetState;
	}

}
