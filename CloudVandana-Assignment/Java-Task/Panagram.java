import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case insensitivity
        
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean isPangram(String sentence) {
        // Create a boolean array to track the presence of each alphabet from 'a' to 'z'
        boolean[] alphabetPresent = new boolean[26];

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                // Mark the corresponding alphabet as present
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all alphabets are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false; // If any alphabet is missing, it's not a pangram
            }
        }

        return true;
    }
}
