//count no of palidromes

import java.util.Scanner;

public class q8 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Random word
        System.out.println("Enter a random word:");
        String word = scanner.next();

        // Output: Number of palindromes
        int palindromeCount = countPalindromes(word);
        System.out.println("Number of palindromes: " + palindromeCount);
    }

    // Function to count palindromes
    private static int countPalindromes(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            // For odd length palindromes
            count += countPalindromesFromCenter(word, i, i);

            // For even length palindromes
            count += countPalindromesFromCenter(word, i, i + 1);
        }

        return count;
    }

    // Helper function to count palindromes from a given center
    private static int countPalindromesFromCenter(String word, int left, int right) {
        int count = 0;

        while (left >= 0 && right < word.length() && word.charAt(left) == word.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }
}
