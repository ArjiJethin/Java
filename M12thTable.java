public class M12thTable {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Descending Multiplication table of " + n + "\n");
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}