package br.com.zanichelli.abstractfactory;

public class GnuButton implements IButton {

	private String label;

	public GnuButton(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}

}
