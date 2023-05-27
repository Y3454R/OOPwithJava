public class VarArgsTest {
    static void vaTest(int ...v) {
        for(int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ...v) {
        for(boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.print(msg + " ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

//    // ambiguity
//    static void vaTest(int n, int ... v) {
//        System.out.print(n + " ");
//        for(int x : v)
//            System.out.print(x + " ");
//        System.out.println();
//    }

    public static void main(String[] args) {
        vaTest(2,3,4);
        vaTest("hello", 2,3,4);
        vaTest(true, false, true);
//        vaTest(); //ambiguity
    }
}
