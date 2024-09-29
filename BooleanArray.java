import java.util.Scanner;

public class BooleanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the boolean array: ");
        int n = sc.nextInt();

        boolean[] array = new boolean[n];

        System.out.println("Enter elements of the boolean array (true/false):");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "] (true/false): ");
            array[i] = sc.nextBoolean();
        }

        System.out.println("\nElements of the boolean array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element [" + i + "] = " + array[i]);
        }

        sc.close();
    }
}
