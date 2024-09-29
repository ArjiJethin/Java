import java.util.Scanner;

public class GreaterNum2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a 1st number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter a 2nd number: ");
            int num2 = scanner.nextInt();
            System.out.println("The greater number is: " + (num1 > num2 ? num1 : num2));
        }

    }
}
