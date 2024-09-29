import java.util.Scanner;

public class PositiveNum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }
        }
    }
}
