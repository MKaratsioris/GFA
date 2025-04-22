package count;
import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {

    public HashMap countLetters(String str) {
        int index = 0;
        String specialCharsAndNumbs = "1234567890-=\\][\';/.,`~!@#$%^&*()_+|}{:?><\"";
        HashMap occurence = new HashMap();
        char[] strToCharArray = str.toCharArray();
        char[] specialCharsAndNumbsArray = specialCharsAndNumbs.toCharArray();

        for (int i = 0; i < strToCharArray.length; i++) {
            for (int j = 0; j < specialCharsAndNumbsArray.length; j++) {
                if (strToCharArray[i] == specialCharsAndNumbsArray[j] || strToCharArray[i] == ' ') {
                    index = 0;
                } else {
                    char temp = strToCharArray[i];
                    for (char c : strToCharArray) {
                        if (temp == c) {
                            index++;
                        }
                    }
                    occurence.put(temp, index);
                    index = 0;
                }
            }
        }
        return occurence;
    }

//    public static void main(String[] args) {
//
//        CountLetters str = new CountLetters();
////        System.out.println(str.countLetters("abcdefghijklmnopqrstuvwxyz"));
//        System.out.println(str.countLetters("Hi! My name is Michalis and I have a dog named Shiushin. She is THE licking machine!"));
//    }
}
