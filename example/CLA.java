// Command Line Argument

public class CLA {

    public static void main(String[] args) {

        String x[] = new String[5];
        x[0] = "10";
        x[1] = "20";
        x[2] = "30";
        x[3] = "40";
        x[4] = "50";

        int s = 0;
        for (int i = 0; i < x.length; i++) {
            s = s + Integer.parseInt(x[i]);
        }
        System.out.println("Avarage is: " + s / x.length);
    }
}
