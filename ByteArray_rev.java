public class ByteArray_rev {
    public static void main(String[] args) {

        byte[] byteArray = { 10, 20, 30, 40, 50 };

        System.out.println("\n\nArray in Reverse Order:");
        for (int i = byteArray.length - 1; i >= 0; i--) {
            System.out.print(byteArray[i] + " ");
        }
    }
}
