class Addition {
    int add(int a, int b) {
        return (a + b);
    }

    float add(float b, int a) {
        return (b + a);
    }

    float add(float a, float b, float c) {
        return (a + b + c);
    }
}

public class class2 {
    public static void main(String[] args) {
        Addition a = new Addition();
        int v1 = a.add(20, 30);
        float v3 = a.add(20.5f, 30);
        float v2 = a.add(20.5f, 30.6f, 40.6f);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}