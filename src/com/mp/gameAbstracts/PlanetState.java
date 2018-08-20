package com.mp.gameAbstracts;

import java.util.List;
import com.mp.gameInterfaces.PLANETState;

/**
 * 
 * @author Alex Agno II, Claude Sedillio, Jess Gano
 * @description an abstract class that defines what attributes a PlanetState would contain.
 */
public abstract class PlanetState implements PLANETState{	
	protected String name; //state name of planet
	protected String currentPlanetName;
	protected List<Integer> validChoices;
	
	protected PlanetState(String name, String currentPlanetName) {
		this.name = name;
		this.currentPlanetName = currentPlanetName;
	}
	
	public void display() {
		System.out.println("Current State: " + this.name);
		System.out.println("Current Planet: " + this.currentPlanetName);
		this.showCurrentAndOtherPlanet();
		System.out.println("\nChoose your move: ");
		this.showPossibleMoves();
		System.out.println("\n\n");
	}
	
	public List<Integer> getValidChoices() {
		return this.validChoices;
	}
}
