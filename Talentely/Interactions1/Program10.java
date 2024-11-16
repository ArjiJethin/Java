package Talentely.Interactions1;

import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        sc.close();
        String str = Double.toString(n);
        System.out.println(str.replaceAll("/////0", ""));
    }
}

// 2 Marks