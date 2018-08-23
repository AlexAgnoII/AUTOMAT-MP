package com.mp.GUI;

import com.mp.gameAbstracts.PlanetState;

public class Controller {
	
	private View view;
	
	public Controller() {
		this.view = new View();
	}

	public void update(PlanetState planet) {
		view.update(planet);
	}
	
	public void update(PlanetState planet, boolean win) {
		view.update(planet, win);
	}
	
	public void reset()  {
		view.reset();
	}
}
