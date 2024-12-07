package Talentely.Inteactions3;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        double pounds = sc.nextDouble();
        double kg = pounds * 0.453592;
        System.out.printf("%.2f", kg);
    }
}
