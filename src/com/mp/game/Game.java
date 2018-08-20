package com.mp.game;

import java.util.Scanner;

import com.mp.gameAbstracts.PlanetState;
import com.mp.planetStates.StateEarth;

public class Game {
	
	private Scanner sc = new Scanner(System.in);
	private PlanetState planet;
	
	public Game() {
		//initial planet
		planet = StateEarth.getInstance();
		play();
	}
	
	public void play() {
		int input = 0;
		
		while(input != -1) {
			planet.display();
			input = sc.nextInt();
			
			//TODO input validation
			
			setPlanetState(planet.nextPlanet(input));
		}
	}
	
	public void setPlanetState(PlanetState newPlanetState) {
		this.planet = newPlanetState;
	}
	
	
	public static void main(String[] args) {
		new Game();
	}
}
