package br.com.zanichelli.decorator.vehicle;

public class LuxuryCar implements VehicleDecorator {

	private Vehicle vehicle;

	public LuxuryCar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public int cost() {
		return vehicle.cost() * 800;
	}

	@Override
	public int velociteFactor() {
		return vehicle.velociteFactor() + 100;
	}

	@Override
	public int seats() {
		return vehicle.seats();
	}

}
