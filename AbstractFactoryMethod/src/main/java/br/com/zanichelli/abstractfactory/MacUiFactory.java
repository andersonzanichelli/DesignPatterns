package br.com.zanichelli.abstractfactory;

public class MacUiFactory implements IUiFactory {

	@Override
	public IButton getButton() {
		return new MacButton("Mac Button");
	}

	@Override
	public IAlert getAlert() {
		return new MacAlert("Mac alert");
	}

}
