public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!

        System.out.println("Quote before: " + quote);
        int index = quote.indexOf("you");
        String q1 = quote.substring(0, index);
        String q2 = quote.substring(index, quote.length());
        quote = q1.concat("always takes longer than").concat(" ").concat(q2);
        System.out.println("Quote after: " + quote);
    }
}