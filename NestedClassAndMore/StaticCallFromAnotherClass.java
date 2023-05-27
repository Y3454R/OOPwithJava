public class StaticCallFromAnotherClass {
    public static void main(String[] args) {
        StaticTest.f1(84);
        StaticTest st2 = new StaticTest();
        StaticTest.f2_accessToC(st2);
    }
}
