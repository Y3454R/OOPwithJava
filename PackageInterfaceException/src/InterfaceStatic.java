interface MyIFStatic {
    int getNumber();
    default String getString() {
        return "default string";
    }

    static int getDefaultNumber() {
        return 0;
    }
}


class TestClassStatic implements MyIFStatic {
    @Override
    public int getNumber() {
        return 34;
    }
}

public class InterfaceStatic {
    public static void main(String[] args) {
        System.out.println(MyIFStatic.getDefaultNumber());
        TestClassStatic tcs = new TestClassStatic();
        System.out.println(tcs.getNumber());
        //System.out.println(tcs.getDefaultNumber()); //doesn't run
    }
}
