package MSE;

import java.util.Scanner;

public class scanning {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            System.out.println("You entered: " + n);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            sc.close();
        }
    }
}