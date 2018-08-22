package com.mp.game;

import java.util.Scanner;

import com.mp.gameAbstracts.PlanetState;
import com.mp.planetStates.StateEarth;

public class Instruction {
	
	private Scanner sc = new Scanner(System.in);
	private PlanetState start;
	private final int STARTING_PLANET = 1;
	private final int CURRENT_PLANET = 2;
	
	private Instruction() {
		this.start = StateEarth.getInstance();
	}
	
	private static class Instruction_Holder {
		private static final Instruction INSTANCE = new Instruction();
	}
	
	public static Instruction getInstance() {
		return Instruction_Holder.INSTANCE;
	}

	public void guide(PlanetState current) {
		int choice;
		
		if(!current.equals(start)) {		
			System.out.println("Would you like solution from:"
					+ "\n1: Starting planet"
					+ "\n2: Current planet");
			
			
			do {
				System.out.print("Choice: ");
				choice = sc.nextInt();
			}while(choice != 1 && choice != 2);
		}
		
		else {
			System.out.println("Do current");
		}
		
	}
	
	
}
