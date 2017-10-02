package br.com.zanichelli.strategy;

public class NoQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.print("Quiicku, quiicku");
	}

}
