package br.com.zanichelli.factorymethod;

public class PowerUpFactory implements IGameItemFactory {

	private String description;
	private int level;

	public PowerUpFactory(String description, int level) {
		this.description = description;
		this.level = level;
	}

	@Override
	public GameItem createGameItem() {
		return new PowerUp(description, level);
	}

}
