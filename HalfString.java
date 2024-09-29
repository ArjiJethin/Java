import java.util.Scanner;

public class HalfString {
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

        System.out.println("\nFirst half of the elements in the string array:");
        int half = n / 2;

        for (int i = 0; i < half; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}
