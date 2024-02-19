package lesson8;

import java.util.*;

public class ListOfWords {
    public static List<String> initialListOfWords() {
        List<String> listOfWords = new ArrayList<>();

        listOfWords.add("apple");
        listOfWords.add("orange");
        listOfWords.add("banana");
        listOfWords.add("pear");
        listOfWords.add("plum");
        listOfWords.add("pineapple");
        listOfWords.add("apricot");
        listOfWords.add("peach");
        listOfWords.add("apple");
        listOfWords.add("plum");
        listOfWords.add("apricot");
        listOfWords.add("banana");
        listOfWords.add("orange");
        listOfWords.add("apricot");
        listOfWords.add("apple");
        listOfWords.add("apple");
        listOfWords.add("grapes");
        listOfWords.add("pineapple");

        return listOfWords;
    }

    public static Set<String> listOfUniqueWords(List<String> listOfWords) {
        Set<String> listOfUniqueWords = new HashSet<>(listOfWords);

        return listOfUniqueWords;
    }

    public static Map<String, Integer> frequencyOfWords(Set<String> listOfUniqueWords, List<String> listOfWords) {
        Map<String, Integer> resultMapOfWords = new HashMap<>();
        for (String word : listOfUniqueWords) {
            resultMapOfWords.put(word, Collections.frequency(listOfWords, word));
        }
        return resultMapOfWords;
    }
}