package MSE;

class Cars {
    int id;
    String name;
    String model;

    Cars(int i, String name, String model) {
        id = i;
        this.name = name;
        this.model = model;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Model: " + model);
    }
}

public class constructor {
    public static void main(String args[]) {
        Cars vehicle1 = new Cars(23532, "Toyota", "EF34T5");
        Cars vehicle2 = new Cars(12345, "Ferrari", "GT59T6");
        vehicle1.display();
        vehicle2.display();
    }

}
