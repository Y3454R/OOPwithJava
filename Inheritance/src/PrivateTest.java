class M {
    int i;
    private int j;

    void set(int x, int y) {
        i = x;
        j = y;
    }

    void get() {
        System.out.println(i + " " + j);
    }
}

public class PrivateTest {
    public static void main(String[] args) {
        M ob = new M();
        ob.set(2, 3);
        ob.get();
    }
}
