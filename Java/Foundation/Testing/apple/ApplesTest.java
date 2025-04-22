package apple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @Test
    void getApple() {

        Apple testApple = new Apple();
        assertEquals("apple", testApple.getApple());

    }
}