import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    Dragon dragon;

    @BeforeEach
    void setUp() {
        dragon = new Dragon();
    }

    @Test
    void intro() {
        assertEquals("Welcome to Dragon Cave", dragon.intro());
    }

    @Test
    void promptUser() {
        assertEquals("Please pick 1 or 2", dragon.promptUser());
    }

    @Test
    void death() {
        assertEquals("You approach the cave...\n" +
                                "It is dark and spooky\n" +
                                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                                "Gobbles you down in one bite!", dragon.death());
    }

    @Test
    void alive() {
        assertEquals("You approach the cave...\n" +
                                "It is dark and spooky...\n" +
                                "You see flickering light in the distance and hear wood clunking on damp stone.\n" +
                                "There is a hunched over round figure approaching you.\n" +
                                "Someone shouts, 'Who goes there?'", dragon.alive());
    }

}