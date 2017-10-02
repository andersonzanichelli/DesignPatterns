package br.com.zanichelli.strategy;

public class RubberDuckDisplay implements IDisplayBehavior {

	@Override
	public void display() {
		System.out.print("A simple, yellow rubber duck");
	}

}
