package pt.up.fe;

import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.level.MapParser;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest4 {

    private MapParser parser;

    @Before
    public void createParser() {
        LevelFactory levelFactory = new LevelFactory(new PacManSprites(), new GhostFactory(new PacManSprites()));
        BoardFactory boardFactory = new BoardFactory(new PacManSprites());

        parser = new MapParser(levelFactory, boardFactory);
    }

    @Test
    public void test1() {
        List<Ghost> emptyGhosts = new ArrayList<>();
        parser.makeGhostSquare
    }
}
