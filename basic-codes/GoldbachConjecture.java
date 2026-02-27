import java.util.Scanner;

public class GoldbachConjecture {
    
    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an even number greater than 2: ");
        int num = sc.nextInt();

        // Validate input: Must be even and > 2
        if (num <= 2 || num % 2 != 0) {
            System.out.println("Invalid input. Please enter an even number > 2.");
        } else {
            System.out.println("Goldbach Pairs for " + num + ":");
            
            // Check pairs (i) and (num - i)
            for (int i = 2; i <= num / 2; i++) {
                if (isPrime(i) && isPrime(num - i)) {
                    System.out.println(i + " + " + (num - i));
                }
            }
        }
        sc.close();
    }
}