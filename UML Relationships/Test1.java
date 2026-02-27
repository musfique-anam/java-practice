// Inheritance (IS-A)

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // from Animal
        d.bark();  // from Dog
    }
}