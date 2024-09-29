import java.util.Scanner;

public class SecondHalfLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the long array: ");
        int n = sc.nextInt();

        long[] array = new long[n];

        System.out.println("Enter elements of the long array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = sc.nextLong();
        }

        System.out.println("\nSecond half of the elements in the long array:");

        int half = n / 2;
        int i = half;

        do {
            System.out.println(array[i]);
            i++;
        } while (i < n);

        sc.close();
    }
}
