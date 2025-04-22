package cowsnbulls;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CowsAndBullsTest {

    CowsAndBulls game;
    int digits = 4;

    @BeforeEach
    void init() {
        game = new CowsAndBulls(digits);
    }

    @Test
    void getFinished() {
        assertEquals(false, game.finished);
    }

    @Test
    void getPlaying() {
        assertEquals(false, game.playing);
    }

    @Test
    void getGuessesCounter() {
        assertEquals(0, game.guessesCounter);
    }

    @Test
    void guessResult() {
        assertEquals("Invalid input. Guess again.", game.guessResult(50000));
        assertEquals("Invalid input. Guess again.", game.guessResult(0));
        assertEquals("Invalid input. Guess again.", game.guessResult(-50000));
    }
}