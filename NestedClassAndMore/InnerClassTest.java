public class InnerClassTest {
    public static void main(String[] args) {
        Outer objOuter = new Outer();
        Outer.Inner1 objInner1 = objOuter.new Inner1();
        Outer.Inner1.Inner2 objInner2 = objInner1.new Inner2();
        objInner2.test();
    }
}

class Outer {
    int x = 0;
    class Inner1 {
        int x = 1;
        class Inner2{
            int x = 2;
            void test() {
                System.out.println("tuki! jha! " + Outer.Inner1.this.x);
            }
        }
    }
}