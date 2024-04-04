import java.util.HashMap;


public class Q4_DuplicateCharacters {
    public static void findDuplicateChars(String str) {
         
        HashMap<Character, Integer> charFreqMap = new HashMap<>();

        
        str = str.toLowerCase();

        
        for (char ch : str.toCharArray()) {
            
            charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0) + 1);
        }

         
        System.out.println("Duplicate characters in the string:");
        for (char ch : charFreqMap.keySet()) {
            if (charFreqMap.get(ch) > 1) {
                System.out.println(ch + " - Frequency: " + charFreqMap.get(ch));
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello World";

        findDuplicateChars(inputString);
    }
}

