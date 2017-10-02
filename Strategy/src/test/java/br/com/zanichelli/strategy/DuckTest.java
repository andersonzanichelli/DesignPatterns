package br.com.zanichelli.strategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.zanichelli.strategy.Duck;
import br.com.zanichelli.strategy.JetFly;
import br.com.zanichelli.strategy.NoFly;
import br.com.zanichelli.strategy.NoQuack;
import br.com.zanichelli.strategy.RubberDuckDisplay;
import br.com.zanichelli.strategy.SimpleDisplay;
import br.com.zanichelli.strategy.SimpleQuack;
import br.com.zanichelli.strategy.SuperQuack;

public class DuckTest {
	
	Duck subject;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}

	@Test
	public void simpleQuack() {
		subject = new Duck(new NoFly(), new SimpleQuack(), new SimpleDisplay());
		subject.quack();
		
		Assert.assertEquals("Quack!", outContent.toString());
	}
	
	@Test
	public void noFly() {
		subject = new Duck(new NoFly(), new SimpleQuack(), new SimpleDisplay());
		
		subject.fly();
		Assert.assertEquals("Just walk...", outContent.toString());
	}
	
	@Test
	public void simpleDisplay() {
		subject = new Duck(new NoFly(), new SimpleQuack(), new SimpleDisplay());
		subject.display();
		
		Assert.assertEquals("A normal duck", outContent.toString());
	}
	
	@Test
	public void superQuack() {
		subject = new Duck(new NoFly(), new SuperQuack(), new SimpleDisplay());
		subject.quack();
		
		Assert.assertEquals("QUUAAAAAACK!", outContent.toString());
	}
	
	@Test
	public void jetFly() {
		subject = new Duck(new JetFly(), new SuperQuack(), new SimpleDisplay());
		subject.fly();
		
		Assert.assertEquals("vuuuuuuuuuussshhh... Quack", outContent.toString());
	}
	
	@Test
	public void noQuack() {
		subject = new Duck(new NoFly(), new NoQuack(), new SimpleDisplay());
		
		subject.quack();
		Assert.assertEquals("Quiicku, quiicku", outContent.toString());

	}
	
	@Test
	public void rubberDuck() {
		subject = new Duck(new NoFly(), new NoQuack(), new RubberDuckDisplay());
		
		subject.display();
		Assert.assertEquals("A simple, yellow rubber duck", outContent.toString());

	}
}
