interface Callback {
    void call(int param);
}

class Client implements Callback {
    public void call(int p) {
        System.out.println("call method called with " + p);
    }

    public void f() {
        System.out.println("simple method, not related with Callback");
    }
}

class MyClient implements Callback {
    public void call(int x) {
        System.out.println("Mathay ekta jinish asche, " + x);
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
//        Callback c = new Callback(); // hobe na
        Client client = new Client();
        client.call(42);
        client.f();

        // Accessing implementations through interface reference
        Callback cb = new Client();
        cb.call(84);
//        cb.f(); // hobe na

        cb = new MyClient();
        cb.call(420);
    }
}
