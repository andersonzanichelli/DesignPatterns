package br.com.zanichelli.bridge;

public class ArtistResource implements IResource {
	
	private Artist artist;

	public ArtistResource(Artist artist) {
		this.artist = artist;
	}

	@Override
	public String snippet() {
		return artist.bio();
	}

	@Override
	public String title() {
		return artist.name();
	}

	@Override
	public String imageURL() {
		return artist.imageURL();
	}

	@Override
	public String url() {
		return artist.homePage();
	}

}
