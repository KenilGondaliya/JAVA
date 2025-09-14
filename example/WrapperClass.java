public class WrapperClass {
    public static void main(String[] args) {
        int x = Integer.parseInt("123");
        System.out.println(x);

        Integer i1 = Integer.parseInt("1000011", 2);
        int z = i1.intValue();
        System.out.println(z);

        Double x1 = Double.valueOf("56");
        Double y = x1.doubleValue();

        System.out.println(y);
    }
}
