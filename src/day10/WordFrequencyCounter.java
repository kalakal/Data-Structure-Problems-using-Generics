package day10;

import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        // Split the text into words
        String[] words = text.split(" ");

        // Iterate over each word
        for (String word : words) {
            // Convert the word to lowercase to ignore case sensitivity
            word = word.toLowerCase();

            // Calculate the hash code of the word
            int hashCode = word.hashCode();

            // Get the current frequency of the word, or 0 if it's a new word
            int frequency = wordFrequency.getOrDefault(word, 0);

            // Increment the frequency by 1
            wordFrequency.put(word, frequency + 1);
        }

        // Display the word frequencies
        for (String word : wordFrequency.keySet()) {
            int frequency = wordFrequency.get(word);
            System.out.println(word + ": " + frequency);
        }
    }
}
