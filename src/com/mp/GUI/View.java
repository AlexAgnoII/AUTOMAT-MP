package com.mp.GUI;

import java.awt.Graphics;
//import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
	
	private PlanetGUI earth,
	               earth_A,
				   earth_B,
				   earth_C,
			       earth_D,
			       earth_E,
				   earth_F,
				   earth_G,
				   earth_H,
				   mars,
				   mars_A,
				   mars_B,
				   mars_C,
				   mars_D,
				   mars_E,
				   mars_F,
				   mars_G,
				   mars_H;
	
	public static final int CIRLCE_SIZE = 80;
	private final int LABEL_SIZE =  CIRLCE_SIZE;

	
	public View()  {
		initializeScreen();
		addPlanets();
		this.currentPlanet = StateEarth.getInstance();
		
		//show the screen
		this.setVisible(true);
	}

	/**
	 * Updates the automaton to show where the current user is.
	 */
	public void update(PlanetState planet) {
		//set current planet's color to original.
		PlanetGUI currentPanel = findPlanet(currentPlanet);
		PlanetGUI nextPanel = findPlanet(planet);
		
		currentPanel.isActive(false);
		nextPanel.isActive(true);
		currentPlanet = planet;
	}
	
	public void reset()  {
		PlanetGUI currentPanel = findPlanet(currentPlanet);
		currentPanel.isActive(false);
		currentPlanet = StateEarth.getInstance();
	}
	
	public PlanetGUI findPlanet(PlanetState  planet) {
		
		if(planet instanceof StateEarth) {
			return earth;
		}
		
		else if(planet instanceof StateEarth_A) {
			return earth_A;
		}
		
		else if(planet instanceof StateEarth_B) {
			return earth_B;
		}
		
		else if(planet instanceof StateEarth_C) {
			return earth_C;
		}
		
		else if(planet instanceof StateEarth_D) {
			return earth_D;
		}
		
		else if(planet instanceof StateEarth_E) {
			return earth_E;
		}
		
		else if(planet instanceof StateEarth_F) {
			return earth_F;
		}
		
		else if(planet instanceof StateEarth_G) {
			return earth_G;
		}
		
		else if(planet instanceof StateEarth_H) {
			return earth_H;
		}
		
		else if(planet instanceof StateMars) {
			return mars;
		}
		
		else if(planet instanceof StateMars_A) {
			return mars_A;
		}
		
		else if(planet instanceof StateMars_B) {
			return mars_B;
		}
		
		else if(planet instanceof StateMars_C) {
			return mars_C;
		}
		
		else if(planet instanceof StateMars_D) {
			return mars_D;
		}
		
		else if(planet instanceof StateMars_E) {
			return mars_E;
		}
		
		else if(planet instanceof StateMars_F) {
			return mars_F;
		}
		
		else if(planet instanceof StateMars_G) {
			return mars_G;
		}
		
		else if(planet instanceof StateMars_H) {
			return mars_H;
		}
		
		else {
			System.out.println("What is this planet??");
			throw new NullPointerException();
		}
	}
	
	private void addPlanets()  {

		
		planet_holder = new JPanel() {
			public void paintComponent(Graphics g) {
				try {
					BufferedImage img = ImageIO.read(View.class.getResource("/images/edges.png"));
					
					g.drawImage(img, 0, 0, 800, 800, this);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		planet_holder.setBounds(0, 0, 794, 771);
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
	    
		mars_C = new PlanetGUI(StateMars_C.getInstance(), LABEL_SIZE);
		mars_C.setBounds(243, 283, 80, 80);
		planet_holder.add(mars_C);
		
	    mars_D = new PlanetGUI(StateMars_D.getInstance(), LABEL_SIZE);
	    mars_D.setBounds(598, 283, 80, 80);
	    planet_holder.add(mars_D);
	    
	    mars_E = new PlanetGUI(StateMars_E.getInstance(), LABEL_SIZE);
	    mars_E.setBounds(242, 459, 80, 80);
	    planet_holder.add(mars_E);
		
		mars_F = new PlanetGUI(StateMars_F.getInstance(), LABEL_SIZE);
		mars_F.setBounds(598, 459, 80, 80);
		planet_holder.add(mars_F);
		
		mars_G = new PlanetGUI(StateMars_G.getInstance(), LABEL_SIZE);
		mars_G.setBounds(238, 605, 80, 80);
		planet_holder.add(mars_G);
		
	    mars_H = new PlanetGUI(StateMars_H.getInstance(), LABEL_SIZE);
	    mars_H.setBounds(603, 605, 80, 80);
	    planet_holder.add(mars_H);
		
		
		//////////////////////////////////////////////
	    earth = new PlanetGUI(StateEarth.getInstance(), LABEL_SIZE);
	    earth.setBounds(60, 55, 80, 80);
	    planet_holder.add(earth);
	    
		earth_A = new PlanetGUI(StateEarth_A.getInstance(), LABEL_SIZE);
		earth_A.setBounds(60, 178, 80, 80);
		planet_holder.add(earth_A);
		
	    earth_B = new PlanetGUI(StateEarth_B.getInstance(), LABEL_SIZE);
	    earth_B.setBounds(417, 178, 80, 80);
	    planet_holder.add(earth_B);
	    
	    earth_C = new PlanetGUI(StateEarth_C.getInstance(), LABEL_SIZE);
	    earth_C.setBounds(60, 306, 80, 80);
	    planet_holder.add(earth_C);
	    
	    earth_D = new PlanetGUI(StateEarth_D.getInstance(), LABEL_SIZE);
	    earth_D.setBounds(417, 283, 80, 80);
	    planet_holder.add(earth_D);
	    
	    earth_E = new PlanetGUI(StateEarth_E.getInstance(), LABEL_SIZE);
	    earth_E.setBounds(58, 459, 80, 80);
	    planet_holder.add(earth_E);
	    
	    earth_F = new PlanetGUI(StateEarth_F.getInstance(), LABEL_SIZE);
	    earth_F.setBounds(417, 459, 80, 80);
	    planet_holder.add(earth_F);
	    
	    earth_G = new PlanetGUI(StateEarth_G.getInstance(), LABEL_SIZE);
	    earth_G.setBounds(58, 605, 80, 80);
	    planet_holder.add(earth_G);
	    
		earth_H = new PlanetGUI(StateEarth_H.getInstance(), LABEL_SIZE);
		earth_H.setBounds(417, 605, 80, 80);
		planet_holder.add(earth_H);

	}
	
	private void initializeScreen() {
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Automaton");
		getContentPane().setLayout(null);
	}
}
