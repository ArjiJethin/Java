import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the integer array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements of the integer array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        System.out.println("\nThe sum of all elements in the array is: " + sum);

        sc.close();
    }
}
