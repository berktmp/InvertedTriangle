import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of digits from the user
        System.out.print("Enter the number of digits: ");
        int numDigits = scanner.nextInt();

        // Draw the inverted triangle
        for (int i = numDigits; i >= 1; i--) {
            // Print spaces before the asterisks
            for (int j = 1; j <= numDigits - i; j++) {
                System.out.print(" ");
            }

            // Print the asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
