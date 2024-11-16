package Talentely.Interactions1;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexInput = scanner.nextLine();
        int decimalOutput = Integer.parseInt(hexInput, 16);
        System.out.println("The integer value is: " + decimalOutput);
        scanner.close();
    }
}

/*
 * Scanner sc = new Scanner(System.in);
 * String str;
 * str = sc.next();
 * sc.close();
 * long n = Long.parseLong(str.substring(2, 16));
 * System.out.println(n);
 */

// 2 Marks