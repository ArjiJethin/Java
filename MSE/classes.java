package MSE;

class Vehicle {
    int Registration;
    String Model;
}

public class classes {
    public static void main(String args[]) {
        Vehicle vehicle = new Vehicle();
        vehicle.Registration = 1234;
        vehicle.Model = "Toyota Corolla";
        System.out.println("Registration Number: " + vehicle.Registration);
        System.out.println("Model: " + vehicle.Model);
    }

}
