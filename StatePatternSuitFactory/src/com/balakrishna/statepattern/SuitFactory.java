package com.balakrishna.statepattern;

public class SuitFactory {

	public static void main(String[] args) {
		SuitFactoryContext suitFactoryContext = new SuitFactoryContext();
		suitFactoryContext.alert();

		suitFactoryContext.setState(new Shutdown());
		suitFactoryContext.alert();

		System.out.println("---set to operating again---");

		suitFactoryContext.setState(new Operating());
		suitFactoryContext.alert();

	}

}
