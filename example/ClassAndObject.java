class Nokia {

    private int mic;
    private int cam;

    void setValues() {
        mic = 2;
        cam = 40;
    }

    void display() {
        System.out.println("mic: " + mic);
        System.out.println("cam: " + cam);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        new Nokia();
    }
}
