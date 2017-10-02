package br.com.zanichelli.strategy;

public class NoFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.print("Just walk...");
	}

}
