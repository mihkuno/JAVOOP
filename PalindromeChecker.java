import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        scanner.close();
        
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {
        // Convert the word to lowercase for case-insensitive comparison
        word = word.toLowerCase();

        // Convert the word to a character array
        char[] charArray = word.toCharArray();

        // Initialize pointers for the start and end of the word
        int left = 0;
        int right = charArray.length - 1;

        // Check if the word is a palindrome
        while (left < right) {
            // Ignore non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(charArray[left])) {
                left++;
            }
            // Ignore non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(charArray[right])) {
                right--;
            }
            // If characters at left and right pointers are not equal, it's not a palindrome
            if (charArray[left] != charArray[right]) {
                return false;
            }
            // Move pointers towards the center
            left++;
            right--;
        }
        // If the loop completes without returning false, the word is a palindrome
        return true;
    }
}
