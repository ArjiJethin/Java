// Write a java program by using parametarized constructor for desktop , and
// same for 2wheelers hehe

class Laptop {
    String Processor;
    int Graphics;
    int RAM;
    int ROM;

    Laptop(String Processor, int Graphics, int RAM, int ROM) {
        System.out.println("Processor: " + Processor);
        System.out.println("Graphics: " + Graphics);
        System.out.println("RAM: " + RAM);
        System.out.println("ROM:  " + ROM);
    }
}

class Two_wheelers {
    String Model_Name;
    int License;
    int Registration;

    void Laptop(String Model_Name, int License, int Registration) {
        System.out.println("Processor: " + Model_Name);
        System.out.println("Graphics: " + License);
        System.out.println("RAM: " + Registration);
    }
}