package com.mp.planetStates;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateMars_G extends PlanetState{

	protected StateMars_G() {
		super("Mars G", PLANETState.MARS);
		// TODO Auto-generated constructor stub
	}
	
	private static class StateMars_G_Holder {
		private static final StateMars_G INSTANCE = new StateMars_G();
	}

	
	public static StateMars_G getInstance() {
		return StateMars_G_Holder.INSTANCE;
	}
	
	@Override
	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Human");
		System.out.println("  -      |    Lion");
		System.out.println("  -      |    Cow");
		System.out.println("  -      |    Grain");
	}

	@Override
	public void showPossibleMoves() {
		System.out.println(GameMessages.GOODEND);
	}

	@Override
	public PlanetState nextPlanet(int input) {
		// TODO Auto-generated method stub
		return null;
	}

}
