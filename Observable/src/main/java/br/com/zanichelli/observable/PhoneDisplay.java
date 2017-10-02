package br.com.zanichelli.observable;

public class PhoneDisplay implements IObserver, IDisplay {

	private WeatherStation station;
	private int temp;

	public PhoneDisplay(WeatherStation station) {
		this.station = station;
	}

	@Override
	public void update() {
		temp = station.getTemperature();
		
	}

	@Override
	public String display() {
		return String.format("The temperature is %s", temp);
	}

}
