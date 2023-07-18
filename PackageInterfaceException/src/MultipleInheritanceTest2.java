interface Alpha2 {
    default void reset() {
        System.out.println("Alpha's reset");
    }
}

interface Beta2 extends Alpha2 {
    default void reset() {
        System.out.println("Beta's reset");
    }
}

//class TestClass2 implements Alpha, Beta {  //doesn't work
//
//}

class TestClass2 implements Beta2 {

}

public class MultipleInheritanceTest2 {
    public static void main(String[] args) {
        TestClass2 tc = new TestClass2();
        tc.reset();
    }
}
