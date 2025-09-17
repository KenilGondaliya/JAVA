class Calculator {
    // Overloaded add methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverLoadingAndOveriding {
    public static void main(String[] args) {
        // -------- Overloading Example --------
        Calculator calc = new Calculator();
        System.out.println("Add two ints: " + calc.add(5, 10));
        System.out.println("Add two doubles: " + calc.add(5.5, 3.2));
        System.out.println("Add three ints: " + calc.add(1, 2, 3));

        // -------- Overriding Example --------
        Animal a = new Animal();
        a.sound(); // Calls parent method

        Animal d = new Dog(); // Polymorphism
        d.sound(); // Calls overridden method in Dog
    }
}
