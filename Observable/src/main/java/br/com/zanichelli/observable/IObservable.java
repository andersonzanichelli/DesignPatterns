package br.com.zanichelli.observable;

public interface IObservable {

	void add(IObserver observer);
	void remove(IObserver observer);
	void notification();
}
