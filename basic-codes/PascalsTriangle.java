import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();

        // OUTER LOOP: Controls which row we are on (starting at 0 for the math to work)
        for (int i = 0; i < rows; i++) {
            
            // INNER LOOP 1: Prints the blank spaces to make it a pyramid shape
            for (int space = 1; space < rows - i; space++) {
                // Using double spaces here helps keep the numbers from squishing together
                System.out.print("  "); 
            }

            // The first number in every row of Pascal's Triangle is always 1
            int number = 1;
            
            // INNER LOOP 2: Prints the actual numbers for the row
            for (int j = 0; j <= i; j++) {
                // Print the current number with some spacing
                System.out.print(number + "   ");
                
                // The "Magic" Math Formula to calculate the next number in the line
                number = number * (i - j) / (j + 1);
            }
            
            // Move to the next line after the row is done
            System.out.println();
        }

        scanner.close();
    }
}