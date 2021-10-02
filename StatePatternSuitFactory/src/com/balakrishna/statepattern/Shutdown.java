package com.balakrishna.statepattern;

public class Shutdown implements SuitFactoryAlertState {

	public void alert() {
		System.out.println("Suit Factory is Shutdown");
	}

}
