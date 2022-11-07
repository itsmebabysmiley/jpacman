package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**
* <h1>Hello, World!</h1>
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
* <p>
* Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
* 
*
* @author  Zara Ali
* @version 1.0
* @since   2014-03-31 
*/
public class BoardTest {

    private Board board;
    private final int MAXWIDTH = 1;
    private final int MAXHIGHT = 1;

    @BeforeEach
    void setup(){


    }

    /**
     * 4.	Create a test class for Board in which you construct a board with
     * the correct (1×1 is large enough) grid, with a correct BasicSquare on it.
     * Name your class BoardTest and put it in the src/test folder in the package
     * nl.tudelft.jpacman.board. Run your test. Since the board is valid your test
     * should pass. Capture the screenshot of your test result and paste it below.
     */
    @Test
    void testValidBoard(){
        Square s = new BasicSquare();
        Square[][] grid = {{s}};
        board = new Board(grid);
        assertThat(board.getWidth()).isEqualTo(MAXWIDTH);
        assertThat(board.getHeight()).isEqualTo(MAXHIGHT);
    }

    @Test
    void testSquareAt(){
        Square s = new BasicSquare();
        Square[][] grid = {{null}};
        board = new Board(grid);
        int x = 0, y = 0;
        Square result = board.squareAt(x,y);
        assertThat(result).isEqualTo(grid[x][y]);
    }
}
