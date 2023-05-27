class OuterStaticInner {
    private int outer_x = 100;
    int outer_y = 200;

    void test() {
        Inner inner = new Inner();
        inner.display(this);
    }

    // this is a static nested class
    static class Inner {
        void display(OuterStaticInner outer) {  // object is required to access outer_x
            System.out.println(outer.outer_x);
        }

    }
}

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        OuterStaticInner outer = new OuterStaticInner();
        outer.test();
        OuterStaticInner.Inner in = new OuterStaticInner.Inner(); // to create an object static nested class
        in.display(outer);
    }
}
