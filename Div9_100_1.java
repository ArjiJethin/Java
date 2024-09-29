public class Div9_100_1 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
