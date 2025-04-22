public class StringsAgain {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars removed.

        String str = "xDoxxx yxou havxe txhex txixmxe xtox gxetx rexaxdxyx??x";
        System.out.println(xToY(str));
    }

    public static String xToY(String phrase) {
        if (phrase.length() <= 1) {
            return phrase.replace("x","");
        } else {
            return ("" + phrase.charAt(0) +
                    "").replace("x","").concat(xToY(phrase.substring(1)));
        }
    }
}
