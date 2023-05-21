public class difLengthCol {
    public static void main(String[] args) {
        int [][] b;
        b = new int [2][];
        b[0] = new int[2];
        b[1] = new int[3];

        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++) {
                b[i][j] = (i+1)*10 + (j+1);
            }
        }

        for(int [] x : b) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
