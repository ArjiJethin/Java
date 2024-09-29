import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the string array: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] array = new String[n];

        System.out.println("Enter elements of the string array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = sc.nextLine();
        }

        System.out.println("\nElements of the string array in reverse order:");

        int i = n - 1;
        while (i >= 0) {
            System.out.println(array[i]);
            i--;
        }

        sc.close();
    }
}
