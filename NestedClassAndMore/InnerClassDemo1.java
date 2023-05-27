class Outer1 {
    private int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    void prvtAccessTest() {
        InnerPrvt prvtObj = new InnerPrvt();
        System.out.println(prvtObj.prvt_x);
    }

    class Inner {
        void display() {
            System.out.println(outer_x);
        }
    }

    private class InnerPrvt {
        int prvt_x = 23;

        void prvt_disp() {
            System.out.println(prvt_x);
        }
    }
}

public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer1 outerObj = new Outer1();
        outerObj.test();
        outerObj.prvtAccessTest();
        Outer1.Inner innerObj = outerObj.new Inner(); // different syntax
        innerObj.display();
//        Outer1.InnerPrvt prvt obj = outerObj.new InnerPrvt(); // can't acess
    }
}
