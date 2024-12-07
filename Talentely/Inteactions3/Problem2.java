package Talentely.Inteactions3;

import java.util.*;
import java.lang.Math;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        double deg = sc.nextDouble();
        double rad = deg * (Math.PI / 180.0);
        System.out.printf("%.2f", rad);

    }
}
