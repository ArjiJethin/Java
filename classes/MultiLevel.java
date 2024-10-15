package classes;

class maths1 {
    void addn(int x, int y) {
        System.out.println("Addition:" + (x + y));
    }
}

class maths2 extends maths1 {
    void subn(int a, int b) {
        System.out.println("Subtraction:" + (a - b));
    }
}

class maths3 extends maths2 {
    void mulpn(int c, int d) {
        System.out.println("Multiplication:" + (c * d));
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        maths3 s1 = new maths3();
        s1.addn(5, 9);
        s1.subn(5, 7);
        s1.mulpn(7, 5);

    }
}
