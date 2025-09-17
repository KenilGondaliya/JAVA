package Package1;

public class A {
    private int x;
    private int y;

    public A() {
    } // constructor must also be public

    public void setData(int var1, int var2) {
        this.x = var1;
        this.y = var2;
    }

    public void display() {
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
    }

}
