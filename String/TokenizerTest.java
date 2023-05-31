import java.util.StringTokenizer;

public class TokenizerTest {
    public static void main(String[] args) {
        String s = new String("What's your news?");
        StringTokenizer tokens = new StringTokenizer(s);
        System.out.println(tokens.countTokens());
        while(tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }

        String t = new String("What's,,your,news?");
        tokens = new StringTokenizer(t, ",");
        System.out.println(tokens.countTokens());
        while(tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }
}
