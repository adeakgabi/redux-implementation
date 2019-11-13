package com.b2international.redux2;

public class Main {
	
	public static void main(String[] args) {
		
		StateReducer reducer = new StateReducer();
		State state = new State(false, 0);
		
		Store<State> store = Store.createStore(state, reducer);
		store.notifySubscribers();
		store.dispatch(Actions.LOGIN);
		store.dispatch(Actions.INCREMENT);
		store.dispatch(Actions.INCREMENT);
		store.dispatch(Actions.DECREMENT);
		store.dispatch(Actions.DECREMENT);
		store.dispatch(Actions.PLUS2);
		store.dispatch(Actions.PLUS2);
		store.dispatch(Actions.PLUS2);
		store.dispatch(Actions.LOGOUT);
		
	}

}
