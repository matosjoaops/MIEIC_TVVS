package nl.tudelft.jpacman;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.Before;
import org.junit.Test;

public class StudentTest1 {

    private Board testBoard;

    @Before
    public void createBoard() {
        Square testSquare = new Square() {
            @Override
            public boolean isAccessibleTo(Unit unit) {
                return false;
            }

            @Override
            public Sprite getSprite() {
                return null;
            }
        };

        Square[][] grid = {{testSquare, testSquare},{testSquare,testSquare}};
        testBoard = new BoardFactory(new PacManSprites()).createBoard(grid);
    }

    @Test(expected = AssertionError.class)
    public void test1() {
        testBoard.squareAt(-1,1);
    }

    @Test
    public void test2() {
        testBoard.squareAt(0, 1);
    }

    @Test
    public void test3() {
        testBoard.squareAt(1,1);
    }

    @Test(expected = AssertionError.class)
    public void test4() {
        testBoard.squareAt(500,500);
    }
}
