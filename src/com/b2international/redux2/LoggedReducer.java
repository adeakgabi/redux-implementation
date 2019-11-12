package com.b2international.redux2;

public class LoggedReducer implements Reducer<Boolean> {

	@Override
	public Boolean reduce(Boolean state, Action action) {
		if (Actions.LOGIN == action) {
			return true;
		} else if (Actions.LOGOUT == action) {
			return false;
		} 
		return state;
	}

}
