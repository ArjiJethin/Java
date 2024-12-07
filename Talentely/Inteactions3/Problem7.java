package Talentely.Inteactions3;

import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        double fh = sc.nextDouble();
        double cs = (fh - 32) * 5 / 9;
        System.out.printf("%.2f Celsius", cs);
    }
}