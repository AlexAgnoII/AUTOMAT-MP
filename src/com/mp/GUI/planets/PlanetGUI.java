package com.mp.GUI.planets;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.mp.GUI.View;
import com.mp.gameAbstracts.PlanetState;

public class PlanetGUI extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PlanetState planetState;
	private JLabel text;
	private Color color;
	private final Color COLOR_ACTIVE = Color.GREEN;
	private final Color COLOR_INACTIVE = Color.black;
	private final Color TEXT_COLOR = Color.WHITE;
	
	public PlanetGUI(PlanetState planetState, int size) {
	    color = color.BLACK;
	    this.setOpaque(false);
	    this.setSize(size, size);
	    this.planetState = planetState;
	    this.setBackground(Color.WHITE);
	    this.text = new JLabel(planetState.getName());
	    this.text.setForeground(this.TEXT_COLOR);
	    this.add(text);
	    
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	    g.setColor(color); 
	    g.drawOval(0,0, View.CIRLCE_SIZE, View.CIRLCE_SIZE); 
	    g.setColor(color); 
	    g.fillOval(0,0, View.CIRLCE_SIZE, View.CIRLCE_SIZE); 
	}
	
	
	
	public void isActive(boolean active) {
		if(active) {
		    //this.text.setForeground(Color.GREEN);
		    color = this.COLOR_ACTIVE;
		}
		
		else {
		    //this.text.setForeground(Color.WHITE);
		    color = this.COLOR_INACTIVE;
		}
		
	    this.repaint();
	}

}
