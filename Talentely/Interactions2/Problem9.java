package Talentely.Interactions2;

import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ts = sc.nextInt();
        sc.close();
        int hr = ts / 3600;
        int rs = ts % 3600;
        int min = rs / 60;
        int s = rs % 60;
        System.out.printf("%02d:HOUR %02dMIN :%02dSEC\n", hr, min, s);
    }
}
