public class MultiDimArray {
    public static void main(String[] args) {
        int [][] b = new int[4][4];
        for(int i = 0; i < b.length; ++i) {
            for(int j = 0; j < b[i].length; ++j) {
                b[i][j] = (i+1)*10 + (j+1);
            }
        }
        for(int [] i : b) {
            for(int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
