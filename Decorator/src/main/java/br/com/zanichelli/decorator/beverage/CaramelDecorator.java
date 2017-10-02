package br.com.zanichelli.decorator.beverage;

public class CaramelDecorator implements CondimentDecorator {
	
	private Beverage beverage;

	public CaramelDecorator(Beverage bevarege) {
		this.beverage = bevarege;
	}

	@Override
	public int cost() {
		return beverage.cost() + 2;
	}

}
