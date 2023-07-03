class P {
    void call() {
        System.out.println("inside P's call method.");
    }
}

class Q extends P {
    void call() {
        System.out.println("inside Q's call method.");
    }
}

class R extends Q {
    void call() {
        System.out.println("inside R's call method.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        P p = new P();
        Q q = new Q();
        R r = new R();
        P x;
        x = p;
        x.call();
        x = q;
        x.call();
        x = r;
        x.call();
    }
}
