package br.com.zanichelli.decorator.vehicle;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

	@Test
	public void simpleCar() {
		Vehicle car = new Car();
		
		Assert.assertEquals(1000, car.cost());
		Assert.assertEquals(10, car.velociteFactor());
		Assert.assertEquals(5, car.seats());
	}
	
	@Test
	public void sportCar() {
		Vehicle car = new Car();
		VehicleDecorator sportCar = new SportCar(car);
		
		Assert.assertEquals(500000, sportCar.cost());
		Assert.assertEquals(1000, sportCar.velociteFactor());
		Assert.assertEquals(2, sportCar.seats());
	}

	@Test
	public void luxuryCar() {
		Vehicle car = new Car();
		VehicleDecorator luxuryCar = new LuxuryCar(car);
		
		Assert.assertEquals(800000, luxuryCar.cost());
		Assert.assertEquals(110, luxuryCar.velociteFactor());
		Assert.assertEquals(5, luxuryCar.seats());
	}
	
	@Test
	public void luxurySportCar() {
		Vehicle car = new Car();
		VehicleDecorator sportCar = new SportCar(car);
		VehicleDecorator luxurySportCar = new LuxuryCar(sportCar);
		
		Assert.assertEquals(400000000, luxurySportCar.cost());
		Assert.assertEquals(1100, luxurySportCar.velociteFactor());
		Assert.assertEquals(2, luxurySportCar.seats());
	}
	
	@Test
	public void simpleMotorCicle() {
		Vehicle motorCicle = new MotorCicle();
		
		Assert.assertEquals(500, motorCicle.cost());
		Assert.assertEquals(8, motorCicle.velociteFactor());
		Assert.assertEquals(2, motorCicle.seats());
	}
	
	@Test
	public void fastMotorCicle() {
		Vehicle motorCicle = new MotorCicle();
		VehicleDecorator fastMotorCicle = new FastMotorCicle(motorCicle);
		
		Assert.assertEquals(7500, fastMotorCicle.cost());
		Assert.assertEquals(240, fastMotorCicle.velociteFactor());
		Assert.assertEquals(2, fastMotorCicle.seats());
	}
}
