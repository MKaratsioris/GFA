package animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal test;

    @BeforeEach
    void init() {
        test = new Animal();
    }

    @Test
    void eat() {
        assertEquals(49, test.eat());
    }

    @Test
    void drink() {
        assertEquals(49, test.drink());
    }

    @Test
    void play() {
        assertEquals(49, test.eat());
    }
}