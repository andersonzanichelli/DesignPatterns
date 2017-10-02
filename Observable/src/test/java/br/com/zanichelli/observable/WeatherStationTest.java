package br.com.zanichelli.observable;

import org.junit.Assert;
import org.junit.Test;

public class WeatherStationTest {
	
	WeatherStation station;

	@Test
	public void test() {
		station = new WeatherStation();
		PhoneDisplay phone = new PhoneDisplay(station);
		WindowDisplay window = new WindowDisplay(station);
		
		station.add(phone);
		station.add(window);
		
		station.setTemperature(10);
		
		station.notification();
		
		Assert.assertEquals("The temperature is 10", phone.display());
		Assert.assertEquals("> 10", window.display());
	}

}
