class AA {
    int a = 2;
}

class BB extends AA {
    int b;
}

class CC extends BB {
    int c;
}

public class InheritanceVarDemo {
    static AA getObject(int type) {
        switch (type) {
            case 0:
                return new AA();
            case 1:
                return new BB();
            case 2:
                return new CC();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        var x = getObject(0);
        var y = getObject(1);
        var z = getObject(2);
        System.out.println(x.a);
//        CC ccObj = getObject(2); // hobe na
        AA aaObj = getObject(2);
//        System.out.println(aaObj.c); // hobe na
//        System.out.println(x.b);
//        System.out.println(x.c);
        System.out.println(aaObj.a);
    }
}
