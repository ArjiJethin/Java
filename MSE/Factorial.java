package MSE;

import java.util.*;

class fact {
    int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int n = sc.nextInt();
        sc.close();
        fact f = new fact();
        int result = f.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
