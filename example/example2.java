class Kenil { // class  

    int x; // instance(object) variable
    int y; // instance(object) variable

    void fun1() { // instance(object) function
        System.out.println("fun1");
    }

    void fun2() {
        System.out.println("fun2");
    }

}

public class example2 {
    public static void main(String[] args) {
        Kenil k1 = new Kenil(); // creating object of class Kenil
        Kenil k2 = new Kenil(); // creating object of class Kenil
        k1.x = 5;
        k2.y = 10;

        System.out.println("hello");
        System.out.println(k2.x); // default value of int is 0 not a garbage value

    }
}
