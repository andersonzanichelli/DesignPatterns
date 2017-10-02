package br.com.zanichelli.decorator.vehicle;

public class FastMotorCicle implements VehicleDecorator {

	private Vehicle vehicle;

	public FastMotorCicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public int cost() {
		return vehicle.cost() * 15;
	}

	@Override
	public int velociteFactor() {
		return vehicle.velociteFactor() * 30;
	}

	@Override
	public int seats() {
		return vehicle.seats();
	}

}
