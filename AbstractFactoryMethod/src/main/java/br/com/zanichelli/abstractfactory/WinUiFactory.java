package br.com.zanichelli.abstractfactory;

public class WinUiFactory implements IUiFactory {

	@Override
	public IButton getButton() {
		return new WinButton("Win Button");
	}

	@Override
	public IAlert getAlert() {
		return new WinAlert("Win AlErT");
	}

}
