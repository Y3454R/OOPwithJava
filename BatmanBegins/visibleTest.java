public class visibleTest {
    public static void main(String[] args) {
        double [] x = {3.2, 3.5, 2.8};
        modifyArray(x);
        for (double i: x) {
            System.out.println(i);
        }
        modifyArray1(x);
        for (double i: x) {
            System.out.println(i);
        }
    }
    public static void modifyArray(double[] d){
        d = new double[3];
        d[0] = 100;
    }
    public static void modifyArray1(double[] d){
        d[0] = 100;
    }
}
