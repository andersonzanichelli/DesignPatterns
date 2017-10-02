package br.com.zanichelli.strategy;

public class SuperQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.print("QUUAAAAAACK!");
	}

}
