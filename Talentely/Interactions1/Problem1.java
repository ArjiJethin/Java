package Talentely.Interactions1;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);
        sc.close();
        System.out.println(ch + ":" + (int) ch);
    }

}

// 2 Marks
