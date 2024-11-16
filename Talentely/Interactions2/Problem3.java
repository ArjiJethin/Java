package Talentely.Interactions2;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("Enter the first number: ");
        a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        b = sc.nextDouble();
        sc.close();
        System.out.printf("%f X %f = %.2f", a, b, a * b);
    }

}
