package Talentely.Inteactions3;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        double temp = sc.nextDouble();
        double fh = ((temp * 9) / 5) + 32;
        System.out.printf("%.2fF", fh);
    }

}
