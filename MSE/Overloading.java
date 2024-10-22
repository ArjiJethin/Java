package MSE;

class OverLoadDemo {
    void test() {
        System.out.println("No argument method");
    }

    void test(int a) {
        System.out.println("One argument method: " + a);
    }

    void test2(int a, int b) {
        System.out.println("Two argument method: " + a + " " + b);
    }

    void test3(double a) {
        System.out.println("Double argument method: " + a);
    }

}

public class Overloading {
    public static void main(String[] args) {
        OverLoadDemo demo = new OverLoadDemo();
        demo.test();
        demo.test(5);
        demo.test2(3, 4);
        demo.test3(5.5);
    }
}
