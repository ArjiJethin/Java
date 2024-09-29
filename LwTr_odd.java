public class LwTr_odd {
    public static void main(String[] args) {
        int odd = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(odd + " ");
                odd += 2;
            }
            System.out.println();
        }

    }

}
