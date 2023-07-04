class Afn {
    void f() {
        System.out.println("This is A method.");
    }
}

class Bfn extends Afn {
    @Override
    final void f() {
        System.out.println("If it's displayed then sub-class's overridden function can be made final.");
    }
}

/*
// hobe na
class Cfn2 extends Bfn {
    @Override
    void f() {
        System.out.println("use of Final testing...");
    }
}
 */
final class BacchaHobeNa {
    void signBoard() {
        System.out.println("Ar kothao shakha nai.");
    }
}

//class DekhiHoyKina extends BacchaHobeNa {
//    void HobeNa() {
//        System.out.println("Baccha hobe naaaa.");
//    }
//}

class Cfn extends Afn {
    @Override
    void f() {
        System.out.println("use of Final testing...");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Bfn BfnObj = new Bfn();
        BfnObj.f();
        Cfn CfnObj = new Cfn();
        CfnObj.f();
    }
}
