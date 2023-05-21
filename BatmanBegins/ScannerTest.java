import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println(scn.nextInt());
        while(scn.hasNextLine()) {
            System.out.println(scn.nextLine());
        }
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextInt());
//        System.out.println(sc.next());
//    }
}
