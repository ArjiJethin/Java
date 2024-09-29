import java.util.Scanner;

public class GreaterNum3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a 1st number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter a 2nd number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter a 2nd number: ");
            int num3 = scanner.nextInt();

            if (num1 > num2 && num1 > num3) {
                System.out.println("The 1st number is the largest: " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("The 2nd number is the largest: " + num2);
            } else {
                System.out.println("The 3rd number is the largest: " + num3);
            }
        }

    }
}
