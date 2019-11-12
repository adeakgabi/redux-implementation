package com.b2international.redux2;

public interface Reducer<S> {

	S reduce(S state, Action action);
	
}
