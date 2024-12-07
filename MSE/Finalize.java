package MSE;

public class Finalize {
    public static void main(String[] args) {
        String string = new String("DSU");
        string = null; // Calling gc method for Garbage Collection System.gc();
        System.out.println("\tI am in Mainmethod");
    }

    public void finalize() {
        System.out.println("\tI am Overriding finalize method");
    }
}