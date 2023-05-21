public class StringArray {
    public static void main(String[] args) {
        String [] str = new String[3];
        str[0] = new String("hello");
        str[1] = "hey there";
        str[2] = "How " + "are" + " you?";
        for(String x : str) {
            System.out.println(x);
        }
    }
}
