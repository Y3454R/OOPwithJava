public class PassingArraysToMethod {
    public static void main(String[] args) {
        double [] ar = {3.2, 3.8, 2.8};
        modifyArray(ar);
        for(double x : ar) {
            System.out.print(x + " ");
        }
    }

    private static void modifyArray(double[] d) {
        for(int i = 0; i < d.length; ++i) {
            d[i]+= 1;
        }
    }
}

// with another class
/*
public class PassingArraysToMethod {
    public static void main(String[] args) {
        double [] ar = {3.2, 3.8, 2.8};
        mod m = new mod();
        m.modifyArray(ar);
        for(double x : ar) {
            System.out.print(x + " ");
        }
    }


}

class mod {
    void modifyArray(double[] d) {
        for(int i = 0; i < d.length; ++i) {
            d[i]+= 1;
        }
    }
}
 */