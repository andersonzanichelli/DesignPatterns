package br.com.zanichelli.bridge;

public class BookResource implements IResource {

	private Book book;

	public BookResource(Book book) {
		this.book = book;
	}
	
	@Override
	public String snippet() {
		return book.sinopse();
	}

	@Override
	public String title() {
		return book.title();
	}

	@Override
	public String imageURL() {
		return book.imageCoverURL();
	}

	@Override
	public String url() {
		return book.url();
	}

}
