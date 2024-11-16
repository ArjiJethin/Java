package Talentely.Interactions2;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();
        sc.close();
        System.out.println("Absolute Difference between" + num1 + " and " + num2 + " is " + Math.abs(num1 - num2));
    }
}

// 2 Marks