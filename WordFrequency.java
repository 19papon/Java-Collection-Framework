import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple";
        String[] words = text.split(" ");
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies: " + frequencyMap);
    }
}
