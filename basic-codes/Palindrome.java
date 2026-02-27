import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // 1. Convert the number into a String (text)
        String originalText = String.valueOf(number);

        // 2. Use Java's built-in tool to reverse the text
        String reversedText = new StringBuilder(originalText).reverse().toString();

        // 3. Check if the original text exactly matches the reversed text
        if (originalText.equals(reversedText)) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is not a Palindrome.");
        }

        scanner.close();
    }
}