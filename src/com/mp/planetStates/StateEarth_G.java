package com.mp.planetStates;

import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateEarth_G extends PlanetState{

	protected StateEarth_G() {
		super("Earth G", PLANETState.EARTH);
		// TODO Auto-generated constructor stub
	}
	
	private static class StateEarth_G_Holder {
		private static final StateEarth_G INSTANCE = new StateEarth_G();
	}
	
	public static StateEarth_G getInstance() {
		return StateEarth_G_Holder.INSTANCE;
	}

	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("Human    |     -  ");
		System.out.println("Lion     |     - ");
		System.out.println("Cow      |     -  ");
		System.out.println("  -      |    Grain");
		
	}

	@Override
	public void showPossibleMoves() {
		System.out.println("1 - Human   |   4 - Human Cow");
		System.out.println("2 - Cow     |   5 - Human Lion");
		System.out.println("3 - Lion    |   6 - Cow Lion");
		
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 4: newPlanetState = StateMars_F.getInstance(); break;
//			case 5: newPlanetState = StateMars_E.getInstance(); break;
			case 6: newPlanetState = StateMars_H.getInstance(); break;
			default: System.out.println("DEAD (Earth G)");
		}
			
		return newPlanetState;
	}
	
}
