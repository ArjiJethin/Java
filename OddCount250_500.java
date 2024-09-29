public class OddCount250_500 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 250; i < 500; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("Number of odd numbers: " + count);
    }
}