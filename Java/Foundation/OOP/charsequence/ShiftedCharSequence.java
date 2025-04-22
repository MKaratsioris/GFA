package charsequence;

import java.util.stream.IntStream;

public class ShiftedCharSequence implements CharSequence {

    String str;
    int numOfCharacters;

    public ShiftedCharSequence(String string, int numOfCharacters) {
        str = string;
        char temp = str.charAt(numOfCharacters);
        char[] ch = str.toCharArray();
        for (int i = numOfCharacters; i > 0; i--) {
            ch[i] = ch[i-1];
        }
        ch[0] = temp;
        str = String.valueOf(ch);
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.str.charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }

    public static void main(String[] args) {
        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter.charAt(0));

        shifter = new ShiftedCharSequence("example", 3);
        System.out.println(shifter.charAt(0));
    }
}














