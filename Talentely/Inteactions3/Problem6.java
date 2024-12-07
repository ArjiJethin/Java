package Talentely.Inteactions3;

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        double sqft = sc.nextDouble();
        double acres = sqft / 43560;
        System.out.printf("%.2f", acres);
    }
}