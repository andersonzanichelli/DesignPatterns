package br.com.zanichelli.command;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ICommandTest {
	
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
	public void turnLightOn() {
		Light light = new Light();
		ICommand turnOn = new TurnLightOn(light);
		ICommand turnoff = new TurnLightOff(light);
		
		
		Invoker invoker = new Invoker(turnOn, turnoff);
		invoker.onButton();
		Assert.assertEquals("On ", outContent.toString());
	}
	
	@Test
	public void turnLightOff() {
		Light light = new Light();
		ICommand turnOn = new TurnLightOn(light);
		ICommand turnoff = new TurnLightOff(light);
		
		
		Invoker invoker = new Invoker(turnOn, turnoff);
		invoker.offButton();
		Assert.assertEquals("Off ", outContent.toString());
	}
	
	@Test
	public void undo() {
		Light light = new Light();
		ICommand turnOn = new TurnLightOn(light);
		ICommand turnoff = new TurnLightOff(light);
		
		Invoker invoker = new Invoker(turnOn, turnoff);
		invoker.onButton();
		Assert.assertEquals("On ", outContent.toString());
		
		invoker.onButton();
		Assert.assertEquals("On On ", outContent.toString());
		
		invoker.offButton();
		Assert.assertEquals("On On Off ", outContent.toString());
		
		invoker.undo();
		Assert.assertEquals("On On Off On ", outContent.toString());
		
		invoker.offButton();
		Assert.assertEquals("On On Off On Off ", outContent.toString());
		
		invoker.undo();
		Assert.assertEquals("On On Off On Off On ", outContent.toString());
	}

}
