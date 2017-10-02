package br.com.zanichelli.strategy;

public class SimpleDisplay implements IDisplayBehavior {

	@Override
	public void display() {
		System.out.print("A normal duck");
	}

}
