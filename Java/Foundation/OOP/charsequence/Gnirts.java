package charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

    String str;

    public Gnirts(String string) {
        str = string;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.str.charAt(str.length() - 1 - index);
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
        Gnirts gnirts = new Gnirts("example");
        System.out.println(gnirts.charAt(1));
        System.out.println(gnirts.charAt(2));
        System.out.println(gnirts.str.length());
        System.out.println(gnirts.str.isEmpty());
        System.out.println(gnirts.str.subSequence(3, gnirts.str.length()));
        System.out.println(gnirts.str.chars());
        System.out.println(gnirts.str.codePoints());

    }
}















