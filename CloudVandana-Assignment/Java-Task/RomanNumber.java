import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Roman Numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert input to uppercase for case insensitivity
        
        int result = romanToInteger(romanNumeral);
        
        if (result == -1) {
            System.out.println("Invalid Roman Numeral.");
        } else {
            System.out.println("Integer Value: " + result);
        }
        
        scanner.close();
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = romanDigitValue(c);
            
            if (value == -1) {
                return -1; // Invalid Roman numeral
            }
            
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            
            prevValue = value;
        }
        
        return result;
    }

    public static int romanDigitValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1; // Invalid Roman numeral
        }
    }
}
