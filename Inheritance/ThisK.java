class Example {
     int x;
     int y;

    void f1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("x = " + x + " y = " + y);
    }
}

class Example1 extends Example {
    int x, y;

    void f3(int x, int y) {
        super.x = x;
        super.y = y;
    }

    void f4() {
        System.out.println("x = " + super.x + " y = " + this.y);
    }
}

public class ThisK {
    public static void main(String[] args) {
        // Example e1 = new Example();
        // e1.f1(1, 2);
        // e1.display();

        Example1 e1 = new Example1();
        e1.f3(3, 4);
        e1.f4();
        
    }
}
