package br.com.zanichelli.abstractfactory;

public class GnuUiFactory implements IUiFactory {

	@Override
	public IButton getButton() {
		return new GnuButton("Gnu Button");
	}

	@Override
	public IAlert getAlert() {
		return new GnuAlert("Gnu Alert");
	}

}
