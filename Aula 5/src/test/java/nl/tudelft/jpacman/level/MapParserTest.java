package nl.tudelft.jpacman.level;

import com.google.common.collect.Lists;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.npc.Ghost;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyChar;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;

public class MapParserTest {

    private MapParser parser;

    private final LevelFactory levelFactory = mock(LevelFactory.class);

    private final BoardFactory boardFactory = mock(BoardFactory.class);

    @Before
    public void setUp() {
        parser = new MapParser(levelFactory, boardFactory);
    }

    @Test
    public void addSquare() {
        Square[][] grid = {{mock(Square.class)}};
        List<Ghost> ghosts = Lists.newArrayList(mock(Ghost.class));
        List<Square> startPositions = Lists.newArrayList(mock(Square.class));

        parser.addSquare(grid, ghosts, startPositions, anyInt(), anyInt(), anyChar());
    }
}
