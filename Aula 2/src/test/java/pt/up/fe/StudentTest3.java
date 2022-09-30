package pt.up.fe;

import nl.tudelft.jpacman.board.*;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class StudentTest3 {

    private LevelFactory factory;
    private Board board;

    private List<Ghost> ghosts;

    private List<Square> positions;
    @Before
    public void createFactory() {
        factory = new LevelFactory(new PacManSprites(), new GhostFactory(new PacManSprites()));
    }

    @Before
    public void createBoards() {
        Square square = new Square() {
            @Override
            public boolean isAccessibleTo(Unit unit) {
                return false;
            }

            @Override
            public Sprite getSprite() {
                return null;
            }
        };

        Square[][] grid = {{square, square}, {square, square}};

        board = new BoardFactory(new PacManSprites()).createBoard(grid);
    }

    @Before
    public void createGhosts() {
        Ghost ghost = new Ghost(new HashMap<>(),1,1) {
            @Override
            public Optional<Direction> nextAiMove() {
                return Optional.empty();
            }
        };

        ghosts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ghosts.add(ghost);
        }
    }

    @Before
    public void createPositions() {
        positions = new ArrayList<>();
        Square square = new Square() {
            @Override
            public boolean isAccessibleTo(Unit unit) {
                return false;
            }

            @Override
            public Sprite getSprite() {
                return null;
            }
        };

        for (int i = 0; i < 5; i++) {
            positions.add(square);
        }
    }

    @Test
    public void test1() {
        List<Ghost> emptyGhosts = new ArrayList<>();

        factory.createLevel(board, emptyGhosts, positions);
    }

    @Test
    public void test2() {
        List<Square> emptyPositions = new ArrayList<>();

        factory.createLevel(board, ghosts, emptyPositions);
    }

    @Test
    public void test3() {
        factory.createLevel(board, ghosts, positions);
    }

}
