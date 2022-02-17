import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class NumberGameTest {

    NumberGame numbergame;

    @BeforeEach
    void setUp() {
        numbergame = new NumberGame();
    }

    @Test
    void intro() {
        assertEquals("I am thinking of a number between 1 and 20.", numbergame.intro());
    }

    @Test
    void promptUser() {
        assertEquals("Take a guess.", numbergame.promptUser());
    }

    @Test
    void winner() {
        assertEquals("Good job! You guessed my number.", numbergame.winner());
    }

    @Test
    void ranOut() {
        assertEquals("You've used all your attempts.", numbergame.ranOut());
    }

    @Test
    void tooHigh() {
        assertEquals("Too high", numbergame.tooHigh());
    }

    @Test
    void tooLow() {
        assertEquals("Too low", numbergame.tooLow());
    }
}