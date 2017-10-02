package br.com.zanichelli.decorator.beverage;

import org.junit.Assert;
import org.junit.Test;

import br.com.zanichelli.decorator.beverage.Beverage;
import br.com.zanichelli.decorator.beverage.CaramelDecorator;
import br.com.zanichelli.decorator.beverage.CondimentDecorator;
import br.com.zanichelli.decorator.beverage.Espresso;
import br.com.zanichelli.decorator.beverage.HoneyDecorator;
import br.com.zanichelli.decorator.beverage.SoyaMilkDecorator;
import br.com.zanichelli.decorator.beverage.Tea;


public class BeverageTest {

	@Test
	public void espressoCoffee() {
		Beverage espresso = new Espresso();
		Assert.assertEquals(5, espresso.cost());
	}

	@Test
	public void espressoCaramel() {
		Beverage espresso = new Espresso();
		CondimentDecorator caramel = new CaramelDecorator(espresso);
		Assert.assertEquals(7, caramel.cost());
	}
	
	@Test
	public void espressoCaramelSoyaMilk() {
		Beverage espresso = new Espresso();
		CondimentDecorator espressoWithCaramel = new CaramelDecorator(espresso);
		CondimentDecorator espressoWithCaramelSoyaMilk = new SoyaMilkDecorator(espressoWithCaramel);
		Assert.assertEquals(8, espressoWithCaramelSoyaMilk.cost());
	}
	
	@Test
	public void tea() {
		Beverage tea = new Tea();
		Assert.assertEquals(2, tea.cost());
	}

	@Test
	public void teaHoney() {
		Beverage tea = new Tea();
		CondimentDecorator teaWithHoney = new HoneyDecorator(tea);
		Assert.assertEquals(5, teaWithHoney.cost());
	}
	
	@Test
	public void teaSoyaMilk() {
		Beverage tea = new Tea();
		CondimentDecorator teaSoyaMilk = new SoyaMilkDecorator(tea);
		Assert.assertEquals(3, teaSoyaMilk.cost());
	}
}
