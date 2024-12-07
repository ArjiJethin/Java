public class UpTrS1 {
    public static void main(String[] args) {
        int i = 1; // Initialize the outer loop counter
        while (i <= 5) { // Outer loop to handle rows
            int j = 1; // Initialize the inner loop counter
            while (j <= 5 - i + 1) { // Inner loop to print stars
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line after finishing a row
            i++;
        }
    }
}

/*
 * 
 * public class UpTrS1 {
 * public static void main(String[] args) {
 * 
 * int i = 1; // Initialize the outer loop counter
 * while (i <= 5) { // Outer loop to handle rows
 * int j = 1; // Initialize the inner loop counter
 * while (j <= 5 - i + 1) { // Inner loop to print stars
 * System.out.print("*");
 * j++;
 * }
 * System.out.println(); // Move to the next line after finishing a row
 * i++;
 * 
 * 
 * for (int i = 1; i <= 5; i++) {
 * for (int j = 1; j <= 5 - i + 1; j++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * }
 * }
 * 
 */