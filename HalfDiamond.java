public class HalfDiamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i && i <= 4; j++) {
                System.out.print(i);
            }
            for (int j = 1; j <= 7 - i + 1 && i > 4; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
