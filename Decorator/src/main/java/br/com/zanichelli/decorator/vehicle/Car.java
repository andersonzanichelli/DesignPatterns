package br.com.zanichelli.decorator.vehicle;

public class Car implements Vehicle {

	@Override
	public int cost() {
		return 1000;
	}

	@Override
	public int velociteFactor() {
		return 10;
	}

	@Override
	public int seats() {
		return 5;
	}

}
