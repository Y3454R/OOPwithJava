interface Alpha {
    default void reset() {
        System.out.println("Alpha's reset");
    }
}

interface Beta {
    default void reset() {
        System.out.println("Beta's reset");
    }
}

class TestClass implements Alpha, Beta {
    public void reset() {
        System.out.println("Test Class's reset.");
    }
}
public class MultipleInheritanceTest {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.reset();
    }
}
