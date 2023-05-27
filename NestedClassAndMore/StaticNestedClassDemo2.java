class OuterStaticInner2 {
    private int outer_x = 100;
    static int static_x = 200;

    static class Inner2 {
        int inner_x = 300;

        void print() {
//            System.out.println(outer_x);
            System.out.println(static_x);
            System.out.println(inner_x);
        }
    }
//    void disp() {
//        System.out.println(inner_x); // can't access
//    }
 }
public class StaticNestedClassDemo2 {
    public static void main(String[] args) {
//        OuterStaticInner2 outObj = new OuterStaticInner2();
//        outObj.Inner2.print();
        OuterStaticInner2.Inner2 inObj = new OuterStaticInner2.Inner2();
        inObj.print();
    }
}
