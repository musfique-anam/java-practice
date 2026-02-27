public class Pyramid {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            
            // 1. Print spaces to center the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 2. Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // 3. Move to the next line
            System.out.println();
        }
    }
}