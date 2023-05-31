public class StringSplitTest {
    public static void main(String[] args) {
        String test = "abc,,def,123";
        String[] out = test.split(",");
        System.out.println(out.length);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
