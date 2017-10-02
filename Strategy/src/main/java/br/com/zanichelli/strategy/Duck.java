package br.com.zanichelli.strategy;

public class Duck {

	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;
	IDisplayBehavior displayBehavior;
	
	public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior, IDisplayBehavior displayBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
		this.displayBehavior = displayBehavior;
	}

	public void quack() {
		quackBehavior.quack();
	}

	public void fly() {
		flyBehavior.fly();
	}

	public void display() {
		displayBehavior.display();
	}
}
