package br.com.zanichelli.observable;

public class WindowDisplay implements IObserver, IDisplay {

	private WeatherStation station;
	private int temp;

	public WindowDisplay(WeatherStation station) {
		this.station = station;
	}

	@Override
	public void update() {
		temp = station.getTemperature();
		
	}

	@Override
	public String display() {
		return String.format("> %s", temp);
	}

}
