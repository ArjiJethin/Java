package Talentely.Inteactions3;

import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        double inches = sc.nextDouble();
        double feet = inches * 0.08333;
        System.out.printf("%.2f", feet);
    }
}