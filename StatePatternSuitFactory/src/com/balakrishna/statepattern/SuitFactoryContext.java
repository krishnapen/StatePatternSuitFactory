package com.balakrishna.statepattern;

public class SuitFactoryContext {

	private SuitFactoryAlertState currentState;

	public SuitFactoryContext() {
		currentState = new Operating();
	}

	public void setState(SuitFactoryAlertState state) {
		currentState = state;
	}

	public void alert() {
		currentState.alert();
	}

}
