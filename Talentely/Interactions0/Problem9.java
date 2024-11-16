
import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        long a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextLong();
        System.out.print("Enter the second number: ");
        b = sc.nextLong();
        sc.close();

        System.out.printf("%05d\n", a);
        System.out.printf("%5d\n", b);
    }
}

// 2 Marks