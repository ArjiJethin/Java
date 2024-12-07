package Talentely.Interactions2;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        double quo = (double) num1 / num2;
        int remainder = num1 % num2;
        System.out.printf("The quotient when " + num1 + " is divided by " + num2 + " is %.16f%n", quo);
        System.out.println("The remainder when " + num1 + " is divided by " + num2 + " is " + remainder);
    }
}
