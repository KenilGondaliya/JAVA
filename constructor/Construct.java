
class Demo {
    int x,y;

    Demo(int a, int b){ // Paramiterized constructor 
        System.out.println("Constructor 1 called");
        x=a;
        y=b;
    }

    void f1(){
        System.out.println("f1 called");
        x=22;
        y=33;
    }
}

class Construct {
    public static void main(String[] args) {
        Demo d1 = new Demo(1,2);
        System.out.println("x = " + d1.x + " y = " + d1.y);
    }
}
