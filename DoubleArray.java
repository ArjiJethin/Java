import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nElements of the array in reverse order:");

        int i = rows - 1;
        int j = cols - 1;

        do {
            System.out.print(array[i][j] + " ");

            if (j == 0) {
                i--;
                j = cols - 1;
            } else {
                j--;
            }
        } while (i >= 0);

        sc.close();
    }
}
