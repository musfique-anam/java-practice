// Composition (Strong HAS-A)

class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    private Engine engine = new Engine();  // created inside

    void startCar() {
        engine.start();
    }
}

public class Test4 {
    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
    }
}