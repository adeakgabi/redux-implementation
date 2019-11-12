package com.b2international.redux2;

public class CounterReducer implements Reducer<Integer> {
	
	public Integer reduce(Integer state, Action action) {
		if (action instanceof Actions) {
			switch ((Actions) action) {
			case INCREMENT:
				return state + 1; 
  			case DECREMENT:
				return state - 1;
			case PLUS2:
				return state + 2;
			default:
				break;
			}
		}
		return state;
	}

}
