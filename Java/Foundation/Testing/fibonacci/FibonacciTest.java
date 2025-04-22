package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {

        Fibonacci test = new Fibonacci();

        assertEquals(-1, test.fibonacci(-10));
        assertEquals(0, test.fibonacci(0));
        assertEquals(1, test.fibonacci(1));
        assertEquals(1, test.fibonacci(2));
        assertEquals(2, test.fibonacci(3));
        assertEquals(3, test.fibonacci(4));
        assertEquals(5, test.fibonacci(5));
        assertEquals(8, test.fibonacci(6));
        assertEquals(13, test.fibonacci(7));
        assertEquals(21, test.fibonacci(8));
        assertEquals(34, test.fibonacci(9));
        assertEquals(55, test.fibonacci(10));


    }
}