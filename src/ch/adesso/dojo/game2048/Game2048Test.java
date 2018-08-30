package ch.adesso.dojo.game2048;

import static org.junit.Assert.*;

import org.junit.Test;

public class Game2048Test {

	@Test
	public void getValue() {
		Game2048 game = new Game2048(1, 2, 4, 8, 34, 76, 35, 89, 0, 0, 0, 0, 0,
				0, 0, 0);
		assertEquals(1, game.getValue(0, 0));
		assertEquals(2, game.getValue(1, 0));
		assertEquals(4, game.getValue(2, 0));
		assertEquals(8, game.getValue(3, 0));
		assertEquals(34, game.getValue(0, 1));
		assertEquals(76, game.getValue(1, 1));
		assertEquals(35, game.getValue(2, 1));
		assertEquals(89, game.getValue(3, 1));
	}

	@Test
	public void getSize() {
		assertEquals(4, new Game2048().getSize());
	}

	@Test
	public void cmdLeft_WithoutMerge() {
		Game2048 game = new Game2048(4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(4, game.getValue(0, 0));
		assertEquals(0, game.getValue(1, 0));
		assertEquals(0, game.getValue(2, 0));
		assertEquals(2, game.getValue(3, 0));
		game.cmdLeft();
		assertEquals(4, game.getValue(0, 0));
		assertEquals(2, game.getValue(1, 0));
		assertEquals(0, game.getValue(2, 0));
		assertEquals(0, game.getValue(3, 0));
	}

	@Test
	public void cmdLeft_WithMerge() {
		Game2048 game = new Game2048(0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(0, game.getValue(0, 0));
		assertEquals(2, game.getValue(1, 0));
		assertEquals(0, game.getValue(2, 0));
		assertEquals(2, game.getValue(3, 0));
		game.cmdLeft();
		assertEquals(4, game.getValue(0, 0));
		assertEquals(0, game.getValue(1, 0));
		assertEquals(0, game.getValue(2, 0));
		assertEquals(0, game.getValue(3, 0));
	}

	@Test
	public void cmdLeft_WithMergeAndAnotherNumber() {
		Game2048 game = new Game2048(2, 0, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(2, game.getValue(0, 0));
		assertEquals(0, game.getValue(1, 0));
		assertEquals(2, game.getValue(2, 0));
		assertEquals(4, game.getValue(3, 0));
		game.cmdLeft();
		assertEquals(4, game.getValue(0, 0));
		assertEquals(4, game.getValue(1, 0));
		assertEquals(0, game.getValue(2, 0));
		assertEquals(0, game.getValue(3, 0));
	}

	@Test
	public void testCmdUp_WithoutMerge() throws Exception {
		Game2048 game = new Game2048(2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(2, game.getValue(0, 0));
		assertEquals(2, game.getValue(1, 1));
		game.cmdUp();
		assertEquals(2, game.getValue(0, 0));
		assertEquals(2, game.getValue(1, 0));
		assertEquals(0, game.getValue(1, 1));
		
	}
	
	@Test
	public void testCmdUp_WithMerge() throws Exception {
		Game2048 game = new Game2048(2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(2, game.getValue(0, 0));
		assertEquals(2, game.getValue(0, 1));
		game.cmdUp();
		assertEquals(4, game.getValue(0, 0));
		assertEquals(0, game.getValue(0, 1));
		
	}
	
	@Test
	public void testCmdUp_WithMergeAndAnotherNumber() throws Exception {
		Game2048 game = new Game2048(2, 0, 0, 0, 2, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(2, game.getValue(0, 0));
		assertEquals(2, game.getValue(0, 1));
		assertEquals(4, game.getValue(0, 2));
		game.cmdUp();
		assertEquals(4, game.getValue(0, 0));
		assertEquals(4, game.getValue(0, 1));
		assertEquals(0, game.getValue(0, 2));
		
	}
	
	

}
