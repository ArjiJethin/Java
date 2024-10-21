package MSE;

class MathUtil {
    public static int add(int x, int y) {
        return x + y;
    }
}

class Multiply {
    int multiply(int x, int y) {
        return x * y;
    }
}

public class Methods {
    public static void main(String[] args) {
        Multiply mul = new Multiply();

        int sum = MathUtil.add(5, 10);
        System.out.println("Sum: " + sum);
        int product = mul.multiply(5, 10);
        System.out.println("Product: " + product);

    }

}
