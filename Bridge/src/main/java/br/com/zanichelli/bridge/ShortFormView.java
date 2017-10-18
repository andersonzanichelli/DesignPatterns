package br.com.zanichelli.bridge;

public class ShortFormView extends View {

	public ShortFormView(IResource r) {
		super(r);
	}

	@Override
	public String show() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.resource.title());
		sb.append(this.resource.imageURL());
		sb.append(this.resource.url());
		
		return sb.toString();
	}
}
