package br.com.zanichelli.factorymethod;

public class Enemy implements GameItem {

	private String descripton;
	private int level;

	public Enemy(String description, int level) {
		this.descripton = description;
		this.level = level;
	}

	@Override
	public String description() {
		return descripton;
	}

	@Override
	public int level() {
		return level;
	}

}
