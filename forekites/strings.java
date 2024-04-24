package forekites;

import java.util.*;

public class strings {
    
    public static int countVowelStrings(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) return 0;
        
        // Define the vowels array
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        // Initialize a set to store unique strings
        Set<String> uniqueStrings = new HashSet<>();
        
        // Helper function to recursively generate strings
        generateStrings(n, vowels, new StringBuilder(), uniqueStrings);
        
        // Return the count of unique strings
        return uniqueStrings.size();
    }
    
    // Recursive function to generate all strings of length n
    private static void generateStrings(int n, char[] vowels, StringBuilder current, Set<String> uniqueStrings) {
        // Base case: if the length of the current string is n, add it to the set
        if (current.length() == n) {
            uniqueStrings.add(current.toString());
            return;
        }
        
        // Recursive step: append each vowel to the current string and recursively generate the next character
        for (char vowel : vowels) {
            current.append(vowel);
            generateStrings(n, vowels, current, uniqueStrings);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println("N=1: " + countVowelStrings(1));
        System.out.println("N=2: " + countVowelStrings(2));
        System.out.println("N=3: " + countVowelStrings(3));
        // Add more test cases as needed
    }
}
