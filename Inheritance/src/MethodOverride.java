class Base {
    int a;

    Base(int a) {
        this.a = a;
    }

    void show() {
        System.out.println("a: " + a);
    }
}

class Child extends Base {
    int b;

    Child(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    void show() {
        System.out.println("a: " + a + " and b: " + b);
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Child childObj = new Child(10, 20);
        childObj.show();
        Base baseObj = childObj;
        baseObj.show(); // how can baseObj access to childObj's b?
        Base baseObj2 = new Child(50, 70);
        baseObj2.show();
    }
}
