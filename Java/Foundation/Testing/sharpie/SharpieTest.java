package sharpie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {

    @Test
    void use() {

        Sharpie test = new Sharpie();
        assertEquals(90, test.use());

    }
}