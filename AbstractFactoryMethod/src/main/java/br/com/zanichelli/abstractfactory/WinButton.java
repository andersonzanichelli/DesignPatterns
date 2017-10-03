package br.com.zanichelli.abstractfactory;

public class WinButton implements IButton {

	private String label;

	public WinButton(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}

}
