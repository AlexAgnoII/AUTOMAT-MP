package com.mp.gameAbstracts;

import java.util.List;
import com.mp.gameInterfaces.PLANETState;

public abstract class PlanetState implements PLANETState{	
	protected String name;
	protected List<PlanetState> possiblePlanetStates;

}
