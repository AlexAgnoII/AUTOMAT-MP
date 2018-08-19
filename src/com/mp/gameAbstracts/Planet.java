package com.mp.gameAbstracts;

import com.mp.gameInterfaces.PLANETState;

/**
 * @author Alex Agno II, Claude Sedillio, Jess Gano
 * @description an abstract class that implements PLANETState, and shows what attributes the states may contain.
 *
 */
public abstract class Planet implements PLANETState {
	protected String name;
	protected PLANETState state;
}
