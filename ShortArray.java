import java.util.Scanner;

public class ShortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the short array: ");
        int n = sc.nextInt();

        short[] array = new short[n];

        System.out.println("Enter elements of the short array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = sc.nextShort();
        }

        System.out.println("\nElements of the short array:");

        int i = 0;
        do {
            System.out.println("Element [" + i + "] = " + array[i]);
            i++;
        } while (i < n);

        sc.close();
    }
}