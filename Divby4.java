import java.util.Scanner;

public class Divby4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 4 == 0) {
            System.out.println("The given number " + num + " is divisible by 4");
        }

        else {
            System.out.println("The given number " + num + " is not divisible by 4");
        }

        scanner.close();
    }
}
