package br.com.zanichelli.observable;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

	private List<IObserver> observers = new ArrayList<>();
	private int temperature;

	@Override
	public void add(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notification() {
		for (IObserver observer : observers)
			observer.update();
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temp) {
		temperature = temp;
	}
}
