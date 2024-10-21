package MSE;

class Cuboid {
    int width;
    int height;
    int depth;

    Cuboid() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Cuboid(int width) {
        this.width = this.height = this.depth = width;
    }

    Cuboid(int width, int height) {
        this.width = width;
        this.height = height;
        this.depth = height;
    }

    Cuboid(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int volume() {
        return width * height * depth;
    }

}

public class constructer_overloading {
    public static void main(String[] args) {
        int vol;

        Cuboid obj1 = new Cuboid();
        Cuboid obj2 = new Cuboid(5);
        Cuboid obj3 = new Cuboid(5, 10);
        Cuboid obj4 = new Cuboid(5, 6, 10);

        vol = obj1.volume();
        System.out.println("Volume of obj1: " + vol);
        vol = obj2.volume();
        System.out.println("Volume of obj2: " + vol);
        vol = obj3.volume();
        System.out.println("Volume of obj3: " + vol);
        vol = obj4.volume();
        System.out.println("Volume of obj4: " + vol);
    }
}
