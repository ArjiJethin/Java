public class LwTr_even {
    public static void main(String[] args) {
        int even = 2;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(even + " ");
                even += 2;
            }
            System.out.println();
        }

    }

}
