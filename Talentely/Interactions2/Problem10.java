package Talentely.Interactions2;

import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long days = sc.nextLong();
        sc.close();
        long year = days / 365;
        long remdays = days % 365;
        long week = remdays / 7;
        long ndays = remdays % 7;
        System.out.println("Number of Years:" + year);
        System.out.println("Number of Week:" + week);
        System.out.println("Number of Days:" + ndays);
    }
}