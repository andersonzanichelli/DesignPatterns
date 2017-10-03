package br.com.zanichelli.abstractfactory;

public class WinAlert implements IAlert {

	private String title;

	public WinAlert(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

}
