package br.com.zanichelli.abstractfactory;

public class MacAlert implements IAlert {

	private String title;

	public MacAlert(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

}
