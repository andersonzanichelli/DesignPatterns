package br.com.zanichelli.bridge;

public class LongFormView extends View {

	public LongFormView(IResource r) {
		super(r);
	}

	@Override
	public String show() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.resource.snippet());
		sb.append(this.resource.title());
		sb.append(this.resource.imageURL());
		sb.append(this.resource.url());
		
		return sb.toString();
	}
}
