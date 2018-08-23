package com.mp.GUI;

import java.awt.Graphics;
//import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.mp.GUI.planets.PlanetGUI;
import com.mp.gameAbstracts.PlanetState;
import com.mp.planetStates.StateEarth;
import com.mp.planetStates.StateEarth_A;
import com.mp.planetStates.StateEarth_B;
import com.mp.planetStates.StateEarth_C;
import com.mp.planetStates.StateEarth_D;
import com.mp.planetStates.StateEarth_E;
import com.mp.planetStates.StateEarth_F;
import com.mp.planetStates.StateEarth_G;
import com.mp.planetStates.StateEarth_H;
import com.mp.planetStates.StateMars;
import com.mp.planetStates.StateMars_A;
import com.mp.planetStates.StateMars_B;
import com.mp.planetStates.StateMars_C;
import com.mp.planetStates.StateMars_D;
import com.mp.planetStates.StateMars_E;
import com.mp.planetStates.StateMars_F;
import com.mp.planetStates.StateMars_G;
import com.mp.planetStates.StateMars_H;

import javax.swing.JPanel;

public class View extends JFrame{
	
	private PlanetState currentPlanet;
	private JPanel planet_holder;
	
	private JPanel earth;
	private JPanel earth_A;
	private JPanel earth_B;
	private JPanel earth_C;
	private JPanel earth_D;
	private JPanel earth_E;
	private JPanel earth_F;
	private JPanel earth_G;
	private JPanel earth_H;
	
	private JPanel mars;
	private JPanel mars_A;
	private JPanel mars_B;
	private JPanel mars_C;
	private JPanel mars_D;
	private JPanel mars_E;
	private JPanel mars_F;
	private JPanel mars_G;
	private JPanel mars_H;
	
	public static final int CIRLCE_SIZE = 80;
	private final int LABEL_SIZE =  CIRLCE_SIZE;

	
	public View()  {
		initializeScreen();
		addPlanets();
		this.currentPlanet = StateEarth.getInstance();
		
		
	}

	/**
	 * Updates the automaton to show where the current user is.
	 */
	public void update(PlanetState planet) {
		
		if(currentPlanet instanceof StateEarth) {
			
		}
		
		else if(currentPlanet instanceof StateEarth_A) {
			
		}
		
		else if(currentPlanet instanceof StateEarth_B) {
			
		}
		
		else if(currentPlanet instanceof StateEarth_C) {
			
		}
		
		else if(currentPlanet instanceof StateEarth_D) {
			
		}
		
		else if(currentPlanet instanceof StateEarth_E) {
			
		}
		
		else if(currentPlanet instanceof StateEarth_F) {
			
		}
		
		else if(currentPlanet instanceof StateEarth_G) {
			
		}
		
		else if(currentPlanet instanceof StateEarth_H) {
			
		}
		
		else if(currentPlanet instanceof StateMars) {
			
		}
		
		else if(currentPlanet instanceof StateMars_A) {
			
		}
		
		else if(currentPlanet instanceof StateMars_B) {
			
		}
		
		else if(currentPlanet instanceof StateMars_C) {
			
		}
		
		else if(currentPlanet instanceof StateMars_D) {
			
		}
		
		else if(currentPlanet instanceof StateMars_E) {
			
		}
		
		else if(currentPlanet instanceof StateMars_F) {
			
		}
		
		else if(currentPlanet instanceof StateMars_G) {
			
		}
		
		else if(currentPlanet instanceof StateMars_H) {
			
		}
		
		else {
			System.out.println("What is this planet??");
		}
		
	}
	
	private void setColor() {
		
	}
	
	private void resetColor() {
		
	}
	
	private void addPlanets()  {

		
		planet_holder = new JPanel() {
			public void paintComponent(Graphics g) {
				this.setVisible(true);
				try {
					BufferedImage img = ImageIO.read(View.class.getResource("/images/edges.png"));
					
					g.drawImage(img, 0, 0, 800, 800, this);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		planet_holder.setBounds(0, 0, 794, 800);
		getContentPane().add(planet_holder);
		planet_holder.setLayout(null);
		
		mars = new PlanetGUI(StateMars.getInstance(), LABEL_SIZE);
		mars.setBounds(243, 55, 80, 80);
		planet_holder.add(mars);

	    mars_A = new PlanetGUI(StateMars_A.getInstance(), LABEL_SIZE);
	    mars_A.setBounds(243, 178, 80, 80);
	    planet_holder.add(mars_A);
	    
	    mars_B = new PlanetGUI(StateMars_B.getInstance(), LABEL_SIZE);
	    mars_B.setBounds(598, 178, 80, 80);
	    planet_holder.add(mars_B);
	    
//		mars_C = new PlanetGUI(StateMars_C.getInstance(), LABEL_SIZE);
//		mars_C.setBounds(639, 283, 80, 80);
//		planet_holder.add(mars_C);
//		
//	    mars_D = new PlanetGUI(StateMars_D.getInstance(), LABEL_SIZE);
//	    mars_D.setBounds(295, 503, 80, 80);
//	    planet_holder.add(mars_D);
//	    
//	    mars_E = new PlanetGUI(StateMars_E.getInstance(), LABEL_SIZE);
//	    mars_E.setBounds(457, 383, 80, 80);
//	    planet_holder.add(mars_E);
//		
//		mars_F = new PlanetGUI(StateMars_F.getInstance(), LABEL_SIZE);
//		mars_F.setBounds(623, 401, 80, 80);
//		planet_holder.add(mars_F);
//		
//		mars_G = new PlanetGUI(StateMars_G.getInstance(), LABEL_SIZE);
//		mars_G.setBounds(75, 515, 80, 80);
//		planet_holder.add(mars_G);
//		
//	    mars_H = new PlanetGUI(StateMars_H.getInstance(), LABEL_SIZE);
//	    mars_H.setBounds(189, 532, 80, 80);
//	    planet_holder.add(mars_H);
		
		
		//////////////////////////////////////////////
	    earth = new PlanetGUI(StateEarth.getInstance(), LABEL_SIZE);
	    earth.setBounds(60, 55, 80, 80);
	    planet_holder.add(earth);
	    
		earth_A = new PlanetGUI(StateEarth_A.getInstance(), LABEL_SIZE);
		earth_A.setBounds(60, 178, 80, 80);
		planet_holder.add(earth_A);
		
	    earth_B = new PlanetGUI(StateEarth_B.getInstance(), LABEL_SIZE);
	    earth_B.setBounds(427, 178, 80, 80);
	    planet_holder.add(earth_B);
//	    
//	    earth_C = new PlanetGUI(StateEarth_C.getInstance(), LABEL_SIZE);
//	    earth_C.setBounds(210, 291, 80, 80);
//	    planet_holder.add(earth_C);
//	    
//	    earth_D = new PlanetGUI(StateEarth_D.getInstance(), LABEL_SIZE);
//	    earth_D.setBounds(512, 401, 80, 80);
//	    planet_holder.add(earth_D);
//	    
//	    earth_E = new PlanetGUI(StateEarth_E.getInstance(), LABEL_SIZE);
//	    earth_E.setBounds(639, 485, 80, 80);
//	    planet_holder.add(earth_E);
//	    
//	    earth_F = new PlanetGUI(StateEarth_F.getInstance(), LABEL_SIZE);
//	    earth_F.setBounds(350, 431, 80, 80);
//	    planet_holder.add(earth_F);
//	    
//	    earth_G = new PlanetGUI(StateEarth_G.getInstance(), LABEL_SIZE);
//	    earth_G.setBounds(623, 178, 80, 80);
//	    planet_holder.add(earth_G);
//	    
//		earth_H = new PlanetGUI(StateEarth_H.getInstance(), LABEL_SIZE);
//		earth_H.setBounds(380, 546, 80, 80);
//		planet_holder.add(earth_H);
		
		

		

	    
	}
	
	private void initializeScreen() {
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Automaton");
		getContentPane().setLayout(null);
		
		
		
		
		//show the screen
		this.setVisible(true);
	}
}
