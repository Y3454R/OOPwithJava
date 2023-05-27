public class StaticTest {
    static int a = 3, b;
    int c;

    // non-static block (can be done in constructor)
    {
        c = 10;
        System.out.println("Hello world from non-static block");
    }

    static void f1(int x) {
//        a = 34;
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
//        System.out.println("c = " + c); // error
    }

    static void f2_accessToC (StaticTest st) {
        System.out.println("c = " + st.c);
    }
    int f2() {
        return a*b;
    }
    static {
        b = a*4;
//        c = b; // error
    }

    public static void main(String[] args) {
        f1(42);
        StaticTest.f1(24); // when in another class
        System.out.println("b = " + b);

//        System.out.println("Area = " + f2()); // error
        StaticTest obj = new StaticTest();
        System.out.println("Area = " + obj.f2());
    }
}
