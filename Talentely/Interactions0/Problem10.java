
import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        System.out.print("Enter the value of n: ");
        n = sc.nextLong();
        sc.close();
        if (n > 0) {
            System.out.println("+" + n);
        } else if (n < 0) {
            System.out.println(n);
        }
    }
}

// 2 Marks
