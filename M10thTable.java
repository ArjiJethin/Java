public class M10thTable {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Multiplication table of " + n + "\n");
        System.out.println("1)For Loop:-");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        System.out.println("\n2)While Loop:-");
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
        System.out.println("\n3)Do-While Loop:-");
        i = 1;
        do {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }
}
