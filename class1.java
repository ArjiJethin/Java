public class class1 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };
        System.out.println("Elements of Original Array:-");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        System.out.println("Elements in New Array:-");
        num = new int[] { 10, 20, 30, 40, 50, 60, 70 };

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();
        System.out.println("Array Length: " + num.length);
    }
}
