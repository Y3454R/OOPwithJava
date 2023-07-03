abstract class Abs {
    abstract void call();

    void call2() {
        System.out.println("This is a concrete method.");
    }
}

class AbSub extends Abs {
    void call() {
        System.out.println("Sub-class implements call method.");
    }
}

public class AbstractTest {
    public static void main(String[] args) {

//        Abs s = new Abs(); // hobe na

        // Anonymous Sub-class (Allowed after Java 8)
        Abs anonymousSubClassObj = new Abs() {
            @Override
            void call() {
                System.out.println("Anonymous Sub-class of Java.");
            }
        };
        anonymousSubClassObj.call();

        AbSub obj = new AbSub();
        obj.call();
        obj.call2();
    }
}
