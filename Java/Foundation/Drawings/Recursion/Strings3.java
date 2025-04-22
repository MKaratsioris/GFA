public class Strings3 {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns a new
        // string with all adjacent chars separated by an `*`. Please note that there
        // should be no trailing `*` at the end of the returned string. For example,
        // the string `word` should be changed to `w*o*r*d`.

        String str = "word";
        System.out.println(xToY(str));
    }

    public static String xToY(String phrase) {
        if (phrase.length() <= 1) {
            return phrase;
        } else {
            return ("" + phrase.charAt(0) +
                    "*").concat(xToY(phrase.substring(1)));
        }
    }
}
