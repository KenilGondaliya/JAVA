package Interface;


interface i1 {
    int x = 6; // public static final by default

    void f1(); // public abstract by default

    // public abstract by default but if body is given using static then use
    // directly by interface name
    static void f2() {
        System.out.println(x);
    }
}

interface i2 extends i1 {

    int x = 19; // public static final by default
    int y = 9; // public static final by default

    void f3();

    static void f2() {
        System.out.println(x);
    }
}

class c1 implements i2 {

    public void f1() {

    }

    static void f2() {
        System.out.println(x);
    }

    public void f3() {

    }
}

public class InterF {
    public static void main(String[] args) {
        // c1 C1 = new c1();
        // System.out.println(C1.x);
        // System.out.println(C1.y);

        i2.f2();

        

        // i1.f2();
    }
}

/*
 * Note: static Method(Function) Inheritance is not possible
 * Note: static Veraible Inheritance is possible
 * 
 */
