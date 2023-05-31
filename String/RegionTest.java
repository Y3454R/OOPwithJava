public class RegionTest {
    public static void main(String[] args) {
        String s1 = new String("hello world");
        String s2 = new String("hello abir");
        System.out.println(s1.regionMatches(0, s2, 0, 5));
        String s3 = new String("2hellO yeasar");
        System.out.println(s1.regionMatches(true, 0, s3, 1, 5));
    }
}
