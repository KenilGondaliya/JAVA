package Package2;

import Package1.A;

public class B {
    public static void main(String[] args) {
        System.out.println("Hello B");
        A a1 = new A();
        a1.setData(5, 6);
        a1.display();
    }
}
