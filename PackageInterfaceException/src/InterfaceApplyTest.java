interface MyInterface {
    void print(String msg);
}

class MyClass1 implements MyInterface {
    public void print(String msg) {
        System.out.println("msg of MyClass1: " + msg);
    }
}

class MyClass2 implements MyInterface {
    public void print(String x) {
        System.out.println("msg of MyClass2: " + x);
    }
}

public class InterfaceApplyTest {
    public static void main(String[] args) {
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();
        MyInterface mi;

        mi = mc1;
        mi.print("Hello world");

        mi = mc2;
        mi.print("Hello world");
    }
}
