package br.com.zanichelli.decorator.vehicle;

public class SportCar implements VehicleDecorator {

	private Vehicle vehicle;

	public SportCar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public int cost() {
		return vehicle.cost() * 500;
	}

	@Override
	public int velociteFactor() {
		return vehicle.velociteFactor() * 100;
	}

	@Override
	public int seats() {
		return 2;
	}

}
