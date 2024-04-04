import java.util.HashMap;

public class Q3_WordCount {
    public static void main(String[] args) {
        String inputString = "Hello world, hello Java, Java programming is fun and exciting!";

        
        inputString = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        
        String[] wordsArray = inputString.split("\\s+");

         
        HashMap<String, Integer> wordFreqMap = new HashMap<>();

         
        for (String word : wordsArray) {
            // Increment the frequency if word already exists in the map, otherwise add it with frequency 1
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
        }

       
        System.out.println("Word frequencies:");
        for (String word : wordFreqMap.keySet()) {
            System.out.println(word + ": " + wordFreqMap.get(word));
        }

         
        System.out.println("Total number of words: " + wordFreqMap.size());
    }
}
