package br.com.zanichelli.factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class GameItemFactoryTest {

	@Test
	public void powerUpFactory() {
		IGameItemFactory powerUpFactory = new PowerUpFactory("A power up", 1);
		GameItem powerUp = powerUpFactory.createGameItem();
		
		Assert.assertEquals("A power up", powerUp.description());
		Assert.assertEquals(1, powerUp.level());
	}

	@Test
	public void enemyFactory() {
		IGameItemFactory enemyFactory = new EnemyFactory("A silly enemy", 1);
		GameItem enemy = enemyFactory.createGameItem();
		
		Assert.assertEquals("A silly enemy", enemy.description());
		Assert.assertEquals(1, enemy.level());
	}
}
