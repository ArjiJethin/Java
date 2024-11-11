package classes;

abstract class Abstract {
    abstract void abstractMethod();
}

class ConcreteClass extends Abstract {
    void abstractMethod() {
        System.out.println("Abstract method implementation in ConcreteClass");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.abstractMethod();
    }

}