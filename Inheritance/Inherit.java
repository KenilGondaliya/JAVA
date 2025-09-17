
// Single Inheritance Example in Java
class Nokia1 {
    int x, y;

    void f1() {
        System.out.println("Parent function 1 executed.");
    }

    void f2() {
        System.out.println("Parent function 2 executed.");
    }
}

class Nokia2 extends Nokia1 {
    int z;

    void f3() {
        System.out.println("Child function 1 executed.");
    }
}

// herarchy Inheritance Example in Java

class A {
    void f1() {
        System.out.println("Function 1 executed.");
    }
}

class B extends A {
    void f2() {
        System.out.println("Function 2 executed.");
    }
}

class C extends A {
    void f3() {
        System.out.println("Function 3 executed.");
    }
}

// Multilevel Inheritance Example in Java

class X {
    void f1() {
        System.out.println("Function 1 executed.");
    }
}

class Y extends X {
    void f2() {
        System.out.println("Function 2 executed.");
    }
}

class Z extends Y {
    void f3() {
        System.out.println("Function 3 executed.");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Nokia2 n1 = new Nokia2();
        n1.f1();
    }
}
