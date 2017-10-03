package br.com.zanichelli.abstractfactory;

public class MacButton implements IButton {

	private String label;

	public MacButton(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}

}
