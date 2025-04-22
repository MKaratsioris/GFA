package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        Anagram anagramTest = new Anagram();
        String str1 = "now";
        String str2 = "own";
        String str3 = "note";
        String str4 = "tone";

        assertEquals(true, anagramTest.isAnagram(str1, str2));
        assertEquals(false, anagramTest.isAnagram(str1, str3));
        assertEquals(false, anagramTest.isAnagram(str1, str4));
        assertEquals(false, anagramTest.isAnagram(str2, str3));
        assertEquals(false, anagramTest.isAnagram(str2, str4));
        assertEquals(true, anagramTest.isAnagram(str3, str4));

    }
}