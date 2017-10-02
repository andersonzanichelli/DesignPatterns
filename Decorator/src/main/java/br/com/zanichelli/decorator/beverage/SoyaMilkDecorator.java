package br.com.zanichelli.decorator.beverage;

public class SoyaMilkDecorator implements CondimentDecorator {

	private Beverage beverage;

	public SoyaMilkDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int cost() {
		return beverage.cost() + 1;
	}

}
