public class ConversionTest {
    public static void main(String[] args) {
        String s = " Hello World ";
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        s = s.trim();
        System.out.println(s);
        s = s.replace("o", "a");
        System.out.println(s);
        int n = 123;
        String s1 = Integer.toString(n);
        System.out.println(s1);
        String s2 = String.valueOf(n);
        System.out.println(s2);
        String s3 = n + "";
        System.out.println(s3);
        String num = "1234";
        n = Integer.parseInt(num);
        System.out.println(n + 1);
    }
}
