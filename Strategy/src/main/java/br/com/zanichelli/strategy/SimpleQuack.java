package br.com.zanichelli.strategy;

public class SimpleQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.print("Quack!");
	}

}
