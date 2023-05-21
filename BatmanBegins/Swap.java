public class Swap {
    public static void main(String[] args) {
        int x = -6, y = 2;
        System.out.println("x: " + x + "\ty: " + y);
        x+= (y - (y = x));
        System.out.println("after swap:");
        System.out.println("x: " + x + "\ty: " + y);
    }
}
