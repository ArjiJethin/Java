package MSE;

public class if_else_ladder {
    public static void main(String args[]) {
        int x = 10;
        if (x % 10 == 0) {
            System.out.println("Divisible by 10");
        } else if (x % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not the mentione Divisible factors");
        }
    }
}