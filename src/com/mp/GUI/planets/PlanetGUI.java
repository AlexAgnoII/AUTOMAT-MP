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
	
	public PlanetGUI(PlanetState planetState, int size) {
	    this.setSize(size, size);
	    this.planetState = planetState;
	    this.setBackground(Color.WHITE);
	    
	    text = new JLabel(planetState.getName());
	    text.setForeground(Color.WHITE);
	    this.add(text);
	    String name = planetState.getName();
	    
	    this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println(name);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
	    	
	    });
	    
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setOpaque(false) ;
	    g.setColor(Color.black); 
	    g.drawOval(0,0, View.CIRLCE_SIZE, View.CIRLCE_SIZE); 
	    g.setColor(Color.red); 
	    g.fillOval(0,0, View.CIRLCE_SIZE, View.CIRLCE_SIZE); 
	}
	
	
	
	public void isActive(boolean active) {
		if(active) {
			
		}
		
		else {
			
		}
	}

}
