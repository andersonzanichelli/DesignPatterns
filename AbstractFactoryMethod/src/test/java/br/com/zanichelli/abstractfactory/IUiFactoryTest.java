package br.com.zanichelli.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class IUiFactoryTest {

	@Test
	public void gnuUi() {
		IUiFactory gnuUi = new GnuUiFactory();
		IButton button = gnuUi.getButton();
		IAlert alert = gnuUi.getAlert();
		
		Assert.assertEquals("Gnu Button", button.getLabel());
		Assert.assertEquals("Gnu Alert", alert.getTitle());
	}

	@Test
	public void winUi() {
		IUiFactory winUi = new WinUiFactory();
		IButton button = winUi.getButton();
		IAlert alert = winUi.getAlert();
		
		Assert.assertEquals("Win Button", button.getLabel());
		Assert.assertEquals("Win AlErT", alert.getTitle());
	}
	
	@Test
	public void macUi() {
		IUiFactory macUi = new MacUiFactory();
		IButton button = macUi.getButton();
		IAlert alert = macUi.getAlert();
		
		Assert.assertEquals("Mac Button", button.getLabel());
		Assert.assertEquals("Mac alert", alert.getTitle());
	}
}
