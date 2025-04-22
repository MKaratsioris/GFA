public class Strings {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars changed to 'y' chars.

        String str = "Do xou have the time to get cleanx and spookx?";
        System.out.println(xToY(str));
    }

    public static String xToY(String phrase) {
        if (phrase.length() <= 1) {
            return phrase.replace("x","y");
        } else {
            return ("" + phrase.charAt(0) +
                    "").replace("x","y").concat(xToY(phrase.substring(1)));
        }
    }
}
