package br.com.zanichelli.factorymethod;

public class EnemyFactory implements IGameItemFactory {

	private String description;
	private int level;

	public EnemyFactory(String description, int level) {
		this.description = description;
		this.level = level;
	}

	@Override
	public GameItem createGameItem() {
		return new Enemy(description, level);
	}

}
