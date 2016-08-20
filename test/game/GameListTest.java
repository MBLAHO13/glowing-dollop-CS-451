package game;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class GameListTest {
    
    @Test
    public void jsonTest() {
        List<Game> pub = new ArrayList<Game>();
        List<Game> current = new ArrayList<Game>();

        GameList gamelist = new GameList(pub, current);
    }

}
