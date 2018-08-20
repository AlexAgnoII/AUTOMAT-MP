package com.mp.gameInterfaces;
import com.mp.gameAbstracts.PlanetState;

/**
 * 
 * @author Alex Agno II, Claude Sedillio, Jess Gano
 * @description an interface that shows a blueprint of what a planetstate should do.
 */
public interface PLANETState {
	public void showCurrentAndOtherPlanet(); //show current and other planet and its contents
	public void showPossibleMoves(); //show possible moves on this current planet
	public PlanetState nextPlanet(int input); //sets the next state.
}
