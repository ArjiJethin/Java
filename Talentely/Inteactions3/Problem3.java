package Talentely.Inteactions3;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        double kg = sc.nextDouble();
        double pound = kg * 2.20462;
        System.out.printf("%.2f Pounds", pound);
    }
}