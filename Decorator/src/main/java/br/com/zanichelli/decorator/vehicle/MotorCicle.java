package br.com.zanichelli.decorator.vehicle;

public class MotorCicle implements Vehicle {

	@Override
	public int cost() {
		return 500;
	}

	@Override
	public int velociteFactor() {
		return 8;
	}

	@Override
	public int seats() {
		return 2;
	}

}
