package br.com.zanichelli.abstractfactory;

public class GnuAlert implements IAlert {

	private String title;

	public GnuAlert(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

}
