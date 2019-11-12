package com.b2international.redux2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class State {
	
	private final boolean isLogged;
	private final int  numberState;
	private final String timeStamp;
	
	public State(boolean isLogged, int numberState) {
		this.isLogged = isLogged;
		this.numberState = numberState;
		this.timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss:SSS").format(new Date());
	}
	
	public boolean isLogged() {
		return isLogged;
	}
	
	public int getNumberState() {
		return numberState;
	}

	@Override
	public String toString() {
		return "Number state: " + numberState + "  |  isLogged state: " + isLogged + "    " + timeStamp;
	}
	
}
