package MSE;

class Obj {
    int a, b;

    Obj(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean isEqual(Obj o) {
        return (o.a == a && o.b == b);
    }
}

public class ObjectParametirization {
    public static void main(String[] args) {
        Obj o1 = new Obj(10, 20);
        Obj o2 = new Obj(10, 20);
        Obj o3 = new Obj(5, 10);

        System.out.println("o1 == o2: " + o1.isEqual(o2));
        System.out.println("o1 == o3: " + o1.isEqual(o3));
    }
}
