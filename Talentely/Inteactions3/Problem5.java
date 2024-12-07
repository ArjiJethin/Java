package Talentely.Inteactions3;

import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        double km = sc.nextDouble();
        double miles = km / 1.6;
        System.out.printf("%.2f Miles", miles);
    }
}