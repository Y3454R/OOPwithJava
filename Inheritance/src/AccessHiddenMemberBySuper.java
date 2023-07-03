class C {
    int i;

    void show() {
        System.out.println("This is super class C.");
    }
}

class D extends C {
    int i; // this i hides the i in super class C

    D(int a, int b) {
        super.i = a; // i in C
        i = b; // i in D
    }

    void show() {
        System.out.println("i in super class: " + super.i);
        System.out.println("i in sub class: " + i);
        super.show();
    }
}

public class AccessHiddenMemberBySuper {
    public static void main(String[] args) {
        D subOb = new D(1, 2);
        subOb.show();
    }
}
