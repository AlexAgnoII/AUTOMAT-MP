package com.mp.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mp.gameAbstracts.PlanetState;
import com.mp.planetStates.StateEarth;
import com.mp.planetStates.StateMars_G;

public class Game {
	
	private Scanner sc = new Scanner(System.in);
	private int input;
	private PlanetState planet;
	private List<Integer> validChoices = new ArrayList<Integer>();
	private static final int YES = 1;
	private static final int NO = 2;

	
	public Game() {
		validChoices.add(this.YES);
		validChoices.add(this.NO);
		//initial planet
		initializeWorld();
		play();
	}
	
	public void play() {
		
		while(input != -1) {
			planet.display();
			
			do {
				System.out.print("Choice: ");
				input = sc.nextInt();
			}while(validateInput(planet.getValidChoices(), input));
			
			setPlanetState(planet.nextPlanet(input));
			
			if(planet == null || planet instanceof StateMars_G) {
				input = -1;
			}
		}
		
		gameOver();
	}
	
	public void gameOver() {
		if(planet instanceof StateMars_G)
			planet.display();

		System.out.println("Do you want to play again?");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
		
		do {
			System.out.print("Choice: ");
			input = sc.nextInt();
		}while(validateInput(validChoices,input));
				
		if(input == 1) {
			reset();
			play();
		}
	}
	
	public boolean validateInput(List<Integer> validChoices, int input) {
		boolean valid = false;
		
		for(int choice : validChoices) {
			if(input == choice) {
				valid = true;
				break;
			}
		}
		
		if(!valid) {
			System.out.println("Please enter a valid choice!");
		}
		
		return !valid;
	}
	
	public void reset() {
		input = 0;
		initializeWorld();
	}
	
	public void initializeWorld() {
		planet = StateEarth.getInstance();
	}
	
	public void setPlanetState(PlanetState newPlanetState) {
		this.planet = newPlanetState;
	}
	
	
	public static void main(String[] args) {
		new Game();
	}
}
