public class Box {
    int L, W, H;

    Box(int l, int w, int h) {
        L = l;
        W = w;
        H = h;
    }

    int getVol() { // method e public private matter kore na?
        return L*W*H;
    }

//    public static void main(String[] args) {
//        Box b1;
//        Box b2;
//        b1 = new Box(8,5,7);
//        b2 = b1;
//        System.out.println("volume of b1: " + b1.getVol());
//        System.out.println("volume of b2: " + b2.getVol());
//        b1 = new Box(2,3,5);
//        System.out.println("after change:");
//        System.out.println("volume of b1: " + b1.getVol());
//        System.out.println("volume of b2: " + b2.getVol());
//        b1 = b2;
//        System.out.println("after change:");
//        System.out.println("volume of b1: " + b1.getVol());
//        System.out.println("volume of b2: " + b2.getVol());
//    }
}
