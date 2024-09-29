import java.util.Scanner;

public class Divby9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 9 == 0) {
            System.out.println("The given number " + num + " is divisible by 9");
        }

        else {
            System.out.println("The given number " + num + " is not divisible by 9");
        }

        scanner.close();
    }
}
