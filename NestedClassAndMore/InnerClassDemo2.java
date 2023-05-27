class Outer2 {
    int outer_x = 100;

    void test() {
        Inner inner2 = new Inner();
        inner2.display();
    }
    class Inner {
        int y = 10; // y is local to Inner
        int outer_x = 200;
        void display() {
            System.out.println("outer x of Inner class: " + outer_x);
        }
        void display2() {
            System.out.println("outer x of Outer class: " + Outer2.this.outer_x);
        }
    }
}
public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer2 outObj = new Outer2();
        Outer2.Inner inObj = outObj.new Inner();
        inObj.display();
        inObj.display2();
    }
}
