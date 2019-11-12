package com.b2international.redux2;

public class StateReducer implements Reducer<State> {

	@Override
	public State reduce(State state, Action action) {
		Integer newCounter = new CounterReducer().reduce(state.getNumberState(), action);
		Boolean newLoggedIn = new LoggedReducer().reduce(state.isLogged(), action);
		if (newLoggedIn == state.isLogged() && newCounter == state.getNumberState()) {
			return state;
		}
		return new State(newLoggedIn, newCounter);
	}

}
