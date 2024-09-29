import java.util.Scanner;

public class SecondHalfFloatArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the float array: ");
        int n = sc.nextInt();

        float[] array = new float[n];

        System.out.println("Enter elements of the float array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = sc.nextFloat();
        }

        System.out.println("\nSecond half of the elements in the float array:");

        int half = n / 2;
        int i = half;

        while (i < n) {
            System.out.println(array[i]);
            i++;
        }
        sc.close();
    }
}
