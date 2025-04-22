import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MostFrequentWord {
    public static void main(String[] args) {

//        Write a function that receives a sentence (string) as a parameter and returns the most frequent word of
//        that sentence. If there is more than one such word return any one of them.
//
//        Test the method with the sentence from John Updike’s 'Rabbit, Run':
//
//        But then they were married (she felt awful about being pregnant before but
//        Harry had been talking about marriage for a while and anyway laughed when
//        she told him in early February about missing her period and said Great she
//        was terribly frightened and he said Great and lifted her put his arms around
//        under her bottom and lifted her like you would a child he could be so
//        wonderful when you didn’t expect it in a way it seemed important that you
//        didn’t expect it there was so much nice in him she couldn’t explain to
//        anybody she had been so frightened about being pregnant and he made her
//        be proud) they were married after her missing her second period in March
//        and she was still little clumsy dark-complected Janice Springer and her
//        husband was a conceited lunk who wasn’t good for anything in the world Daddy
//        said and the feeling of being alone would melt a little with a little drink.
//
//        Expected result: and
//
//        BONUS: Using a simple split(" ") may produce some incorrect words, e.g.
//        "(she" instead of "she" or "drink." instead of "drink". Can you fix that?
//
//                a (a) a, b b c
//
//        Expected result: a

        String s;

        s = "But then they were married (she felt awful about being pregnant before but " +
                "Harry had been talking about marriage for a while and anyway laughed when " +
                "she told him in early February about missing her period and said Great she " +
                "was terribly frightened and he said Great and lifted her put his arms around " +
                "under her bottom and lifted her like you would a child he could be so " +
                "wonderful when you didn’t expect it in a way it seemed important that you " +
                "didn’t expect it there was so much nice in him she couldn’t explain to " +
                "anybody she had been so frightened about being pregnant and he made her " +
                "be proud) they were married after her missing her second period in March " +
                "and she was still little clumsy dark-complected Janice Springer and her " +
                "husband was a conceited lunk who wasn’t good for anything in the world Daddy " +
                "said and the feeling of being alone would melt a little with a little drink.";

        System.out.println(mostFrequentWords(s));

    }

    public static ArrayList<String> mostFrequentWords(String s) {

        // Create a list of words
        String[] wordsArray = s.split(" ");
        List<String> wordList = Arrays.asList(wordsArray);

        // Create a map which has (key-value) => (word-count)
        Map<String, Long> wordCountMap = wordList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Create a list of unique words, a list of their counts and an empty list that will hold the most frequent words
        Set<String> wordSet = wordCountMap.keySet();

        ArrayList<Long> countArrayList = new ArrayList<>(wordCountMap.values());
        Collections.sort(countArrayList);

        ArrayList<String> mostFrequentWordsArrayList = new ArrayList<>();

        // Fill up mostFrequentWordsArrayList
        for (String word : wordSet) {
            if (wordCountMap.get(word).equals(countArrayList.get((countArrayList.size() - 1)))) {
                mostFrequentWordsArrayList.add(word);
            }
        }

        return mostFrequentWordsArrayList;
    }
}
