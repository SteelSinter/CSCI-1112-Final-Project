package game;
import javafx.scene.paint.Color;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import javafx.scene.paint.Color;

class MinesweeperTest {

	@Test
	void boardTest() {
		Board board = new Board(10, 10);
		assertTrue(board.getWidth() == 10);
		assertTrue(board.getHeight() == 10);
		assertFalse(board.getWidth() == 6);
		assertFalse(board.getHeight() == 4);
		
		assertTrue(board.setNumberColor(1) == Color.BLUE);
		
	}

}
