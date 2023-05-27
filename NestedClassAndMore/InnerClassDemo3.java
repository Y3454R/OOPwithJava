//class inside method

class Outer3 {
    int outer_x = 300;

    void test() {
        for(int i = 0; i < 5; i++) {
            class Inner {
                void display() {
                    System.out.println(outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
public class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer3 out3 = new Outer3();
        out3.test();
    }
}
