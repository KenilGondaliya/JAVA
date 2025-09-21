
abstract class Demo1 {
    int x, y;

    void f1() {
        x = 5;
        y = 10;
    }

    abstract void f2();

    Demo1() {
        System.out.println("Parent's Constructor of Demo1");
    }
}

class Demo2 extends Demo1 {
    int z;

    void f3() {
        z = 8;
    }

    void f2() { // Overriding
    };

    Demo2() {
        System.out.println("Child's Constructor of Demo1");
    }
}
class Abs {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        d1.f3();
    }
}