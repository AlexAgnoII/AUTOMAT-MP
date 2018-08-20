package com.mp.gameAbstracts;

import java.util.List;
import com.mp.gameInterfaces.PLANETState;

/**
 * 
 * @author Alex Agno II, Claude Sedillio, Jess Gano
 * @description an abstract class that defines what attributes a PlanetState would contain.
 */
public abstract class PlanetState implements PLANETState{	
	protected String name; //name of planet
	protected PlanetState previousPlanet;
	
	protected PlanetState(String name) {
		this.name = name;
	}
	
	public void display() {
		this.showCurrentAndOtherPlanet();
		System.out.println("\nChoose your move: ");
		this.showPossibleMoves();
		System.out.println("\n\n");
	}
}
