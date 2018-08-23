package com.mp.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mp.GUI.Controller;
import com.mp.gameAbstracts.PlanetState;
import com.mp.planetStates.StateEarth;
import com.mp.planetStates.StateMars_G;

public class Game {
	
	private Scanner sc = new Scanner(System.in);
	private int input = 0;
	private PlanetState planet;
	private GameInstruction instruction;
	private List<Integer> validChoices = new ArrayList<Integer>();
	private final int YES = 1;
	private final int NO = 2;
	private final int INSTRUCTION_PLEASE = 0;
	private final int STOP = -1;
	private Controller controller;

	
	public Game() {
		controller = new Controller();
		instruction = GameInstruction.getInstance();
		validChoices.add(this.YES);
		validChoices.add(this.NO);
		initializeWorld();
		play();
	}
	
	public void play() {
		
		while(input != this.STOP) {
			planet.display();
			controller.update(planet);
			
			do {
				System.out.print("Choice: ");
				input = sc.nextInt();
			}while(validateInput(planet.getValidChoices(), input));
			
			if(input == this.INSTRUCTION_PLEASE) {
				instruction.guide(planet);
			}
				
			else 
				setPlanetState(planet.nextPlanet(input));
			
			if(planet == null || planet instanceof StateMars_G) {
				input = this.STOP;
				
				if(planet != null)
					controller.update(planet);
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
				
		if(input == this.YES) {
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
		
		if(input == 0) {
			return false; //break loop, meaning its valid
		}
		
		else {
			if(!valid) {
				System.out.println("Please enter a valid choice!");
			}
		}
		
		return !valid;
	}
	
	public void reset() {
		input = 0;
		controller.reset();
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
