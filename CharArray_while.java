public class CharArray_while {
    public static void main(String[] args) {

        char[] charArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };

        int i = 0;

        System.out.println("Elements of the character array:");
        while (i < charArray.length) {
            System.out.print(charArray[i] + " ");
            i++;
        }
    }
}
