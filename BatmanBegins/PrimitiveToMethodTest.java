public class PrimitiveToMethodTest {
    public static void main(String[] args) {
        int x;
        x = 53;
        modx(x);
        System.out.println(x);
        int a = 3;
        System.out.println(retmod(a));
        System.out.println("a= " + a);
    }
    public static void modx(int y) {
        y+= 2;
        System.out.println("in function:" + y);
    }

    public static int retmod(int n) {
        return n*10;
    }

}
