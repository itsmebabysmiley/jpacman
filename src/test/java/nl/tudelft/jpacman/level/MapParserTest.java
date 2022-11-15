package nl.tudelft.jpacman.level;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.npc.ghost.Blinky;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;


/**
 * This is a test class for MapParser.
 */
@ExtendWith(MockitoExtension.class)
public class MapParserTest {
    @Mock
    private BoardFactory boardFactory;
    @Mock
    private LevelFactory levelFactory;
    @Mock
    private Blinky blinky;

    private final int checkStyleSuck = 10;
    /**
     * Test for the parseMap method (good map).
     */
//    @Test
//    public void testParseMapGood() {
//        MockitoAnnotations.initMocks(this);
//        assertNotNull(boardFactory);
//        assertNotNull(levelFactory);
//        Mockito.when(levelFactory.createGhost()).thenReturn(blinky);
//        MapParser mapParser = new MapParser(levelFactory, boardFactory);
//        ArrayList<String> map = new ArrayList<>();
//        map.add("############");
//        map.add("#P        G#");
//        map.add("############");
//        mapParser.parseMap(map);
//        Mockito.verify(levelFactory, Mockito.times(1)).createGhost();
//        Mockito.verify(boardFactory,
//            Mockito.times(checkStyleSuck)).createGround();
//    }
//
//    /**
//     * Test for the parseMap method (bad map).
//     */
//    @Test
//    public void testParseMapWrong1() {
//        PacmanConfigurationException thrown =
//            Assertions.assertThrows(PacmanConfigurationException.class, () -> {
//                MockitoAnnotations.initMocks(this);
//                assertNotNull(boardFactory);
//                assertNotNull(levelFactory);
//                MapParser mapParser = new MapParser(levelFactory, boardFactory);
//                ArrayList<String> map = new ArrayList<>();
//                /*
//                Create a map with inconsistent size between
//                each row or contain invalid characters
//                */
//                map.add("############");
//                map.add("#A        G#");
//                map.add("############");
//                mapParser.parseMap(map);
//            });
//        Assertions.assertEquals(PacmanConfigurationException.class, thrown.getMessage());
//    }


}


