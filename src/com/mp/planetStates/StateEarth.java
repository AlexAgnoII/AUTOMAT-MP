package com.mp.planetStates;
import java.util.ArrayList;
import java.util.List;

import com.mp.game.GameMessages;
import com.mp.gameAbstracts.PlanetState;
import com.mp.gameInterfaces.PLANETState;

public class StateEarth extends PlanetState{

	private StateEarth() {
		super("Earth", PLANETState.EARTH);
		List<Integer> validChoices = new ArrayList<Integer>();
		int max = 11;
		for(int i = 0; i < max; i++) {
			validChoices.add(i+1);
		}
		this.validChoices = validChoices;
	}
	
	private static class StateEarthHolder {
		private static final StateEarth INSTANCE = new StateEarth();
	}
	
	public static StateEarth getInstance() {
		return StateEarthHolder.INSTANCE;
	}

	public void showCurrentAndOtherPlanet() {
		System.out.println("EARTH    |    MARS");
		System.out.println("Human    |     -  ");
		System.out.println("Human    |     -  ");
		System.out.println("Lion     |     -  ");
		System.out.println("Cow      |     -  ");
		System.out.println("Grain    |     -  ");
	}

	public void showPossibleMoves() {
		System.out.println("1 - Human        | 7 - Human Cow");
		System.out.println("2 - Lion         | 8 - Human Grain");
		System.out.println("3 - Cow          | 9 - Lion Cow");
		System.out.println("4 - Grain        | 10 - Lion Grain");
		System.out.println("5 - Human Human  | 11 - Cow Grain");
		System.out.println("6 - Human Lion   |");
	}

	@Override
	public PlanetState nextPlanet(int input) {
		PlanetState newPlanetState = null;
		switch(input) {
			case 1:System.out.print(GameMessages.BADEND_1);
				   System.out.print(GameMessages.BADEND_2);
				   System.out.print(GameMessages.BADEND_3);
				   System.out.print(GameMessages.BADEND_4);
				   break;

			case 5: System.out.println(GameMessages.BADEND_3);
			        System.out.print(GameMessages.BADEND_4);
			        break;
			
			case 10: System.out.print(GameMessages.BADEND_2);
			        break;
			case 2: 
			case 6: System.out.print(GameMessages.BADEND_2);
			        System.out.print(GameMessages.BADEND_4);
			        break;			
			case 4: 
			case 8: System.out.print(GameMessages.BADEND_1);
			        System.out.println(GameMessages.BADEND_3);
			        break;
			case 3: 
			case 7: 
			case 11: System.out.print(GameMessages.BADEND_1); 
			         break;
				
			case 9: newPlanetState =  StateMars.getInstance(); break;
			default: System.out.println("DEAD (Earth State");
			        
		}
		
		return newPlanetState;
	}





}
