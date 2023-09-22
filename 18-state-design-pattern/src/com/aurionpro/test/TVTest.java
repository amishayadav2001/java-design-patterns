package com.aurionpro.test;

import com.aurionpro.model.State;
import com.aurionpro.model.TVContext;
import com.aurionpro.model.TVStartState;
import com.aurionpro.model.TVStopState;

public class TVTest {
	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();

	}
}
