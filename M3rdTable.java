public class M3rdTable {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Multiplication table of " + n + "\n");
        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}