package br.com.zanichelli.decorator.beverage;

public class HoneyDecorator implements CondimentDecorator {

	private Beverage beverage;

	public HoneyDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int cost() {
		return beverage.cost() + 3;
	}

}
