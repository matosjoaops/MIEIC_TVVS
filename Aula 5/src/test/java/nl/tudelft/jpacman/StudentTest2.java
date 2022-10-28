package nl.tudelft.jpacman;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.Before;
import org.junit.Test;

public class StudentTest2 {

    private Square testSquare;
    private BoardFactory testFactory;

    @Before
    public void createFactory() {
        testFactory = new BoardFactory(new PacManSprites());
    }

    @Before
    public void createSquare() {
        testSquare = new Square() {
            @Override
            public boolean isAccessibleTo(Unit unit) {
                return false;
            }

            @Override
            public Sprite getSprite() {
                return null;
            }
        };
    }

    @Test(expected = AssertionError.class)
    public void test1() {
        Board board = testFactory.createBoard(null);
    }

    @Test(expected = AssertionError.class)
    public void test2() {
        Square[][] grid = new Square[3][3];

        Board board = testFactory.createBoard(grid);
    }

    @Test
    public void test3() {
        Square[][] grid = {{testSquare, testSquare},{testSquare,testSquare}};

        Board board = testFactory.createBoard(grid);
    }

    @Test
    public void test4() {
        Square[][] grid = {{testSquare,testSquare}};

        Board board = testFactory.createBoard(grid);
    }
}
