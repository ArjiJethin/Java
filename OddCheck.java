import java.util.Scanner;

public class OddCheck {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd
        if (number % 2 != 0) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is not an odd number.");
        }

        // Close the scanner
        scanner.close();
    }
}
