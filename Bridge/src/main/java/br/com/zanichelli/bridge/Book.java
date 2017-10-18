package br.com.zanichelli.bridge;

public class Book {

	private String sinopse;
	private String title;
	private String imageCoverURL;
	private String url;
	
	public Book(String sinopse, String title, String imageCoverURL, String url) {
		this.sinopse = sinopse;
		this.title = title;
		this.imageCoverURL = imageCoverURL;
		this.url = url;
	}

	public String sinopse() {
		return sinopse;
	}

	public String title() {
		return title;
	}

	public String imageCoverURL() {
		return imageCoverURL;
	}

	public String url() {
		return url;
	}

}
