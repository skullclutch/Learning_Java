import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest extends Humanoid {

    Map map;

    @BeforeEach
    void setUp() {
        map = new Map(10);
    }

    @Test
    void combat() {
        int random_Int = 6;
        assertTrue(random_Int >= 5, "The goblin had died. You won.");
        random_Int = 3;
        assertTrue(random_Int <= 5, "You have died. Game over.");
    }
}





