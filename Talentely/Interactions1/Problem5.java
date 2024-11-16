package Talentely.Interactions1;

import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x;
        int n;
        System.out.print("Enter a number: ");
        x = sc.nextFloat();
        System.out.print("Enter the precision number: ");
        n = sc.nextInt();
        sc.close();
        System.out.printf("%." + n + "f", x);
    }
}

// 2 Marks