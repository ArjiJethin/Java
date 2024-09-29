public class HollowSquare {
    public static void main(String[] args) {
        int n = 5; // Size of the square (number of rows/columns)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for boundary elements, space for inner elements
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
