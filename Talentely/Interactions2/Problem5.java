package Talentely.Interactions2;

import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}