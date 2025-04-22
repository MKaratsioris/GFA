package count;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    @Test
    void countLetters() {
        CountLetters str = new CountLetters();
        HashMap test1 = new HashMap();
        test1.put('a', 4);
        test1.put('b', 3);
        test1.put('c', 1);
        test1.put('d', 4);
        HashMap test2 = new HashMap();
        test2.put('a', 1);
        test2.put('b', 1);
        test2.put('c', 1);
        test2.put('d', 1);

        assertEquals(test1, str.countLetters("aaaabbbcdddd"));
        assertEquals(test2, str.countLetters("abcd"));

    }
}