interface myIF {
    int getNumber();
    default String getString() {
        return "default string.";
    }
}

class MyIFImp implements myIF {
    public int getNumber() {
        return 100;
    }
//    public String getString() {
//        return "hello world";
//    }
}

public class InterfaceDefaultMethodTest {
    public static void main(String[] args) {
        MyIFImp m = new MyIFImp();
        System.out.println(m.getNumber());
        System.out.println(m.getString());
    }
}
