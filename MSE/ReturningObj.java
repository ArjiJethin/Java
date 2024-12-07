package MSE;

class object {
    int a;

    object(int a) {
        this.a = a;
    }

    object incrementTen() {
        object temp = new object(a + 10);
        return temp;
    }
}

public class ReturningObj {
    public static void main(String[] args) {
        object obj1 = new object(10);
        object obj2;

        obj2 = obj1.incrementTen();

        System.out.println("obj1.a: " + obj1.a);
        System.out.println("obj2.a: " + obj2.a);
    }
}
