public class ExtractionTest {
    public static void main(String[] args) {
        String s = "hello world";
        for (int i = 0; i < s.length(); i++) {
            System.out.print("\"" + s.charAt(i) + "\"" + " ");
        }
        System.out.println();
        char[] charArray = new char[10];
        s.getChars(0, 5, charArray, 0);
        for (int i = 0; i < 5; i++) {
            System.out.println(charArray[i]);
        }
    }
}
