public class LwTr_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("3");
            }
            System.out.println();
        }
    }
}

/*
 * 
 * public class LwTr_3 {
 * public static void main(String[] args) {
 * 
 * int i = 1; // Initialize the outer loop counter
 * while (i <= 5) { // Outer loop to handle rows
 * int j = 1; // Initialize the inner loop counter
 * while (j <= i) { // Inner loop to print the number '3'
 * System.out.print("3");
 * j++;
 * }
 * System.out.println(); // Move to the next line after finishing a row
 * i++;
 * 
 * for (int i = 1; i <= 5; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print("3");
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 * }
 * 
 * 
 */