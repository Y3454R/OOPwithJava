import javax.sound.midi.Soundbank;

public class SubStringTest {
    public static void main(String[] args) {
        String s = "hello world";
        String subStr = s.substring(0, 6);
        System.out.println(subStr);
        s = "Samin Yeasar Abir";
        String s1 = "Sam";
        String s2 = "ir";
        System.out.println(s.startsWith(s1));
        System.out.println(s.endsWith(s2));
        System.out.println(s.startsWith("Samin"));
    }
}
