public class Triangle {
    public static void main(String[] args) {
        int[][] b = new int[3][];
        for (int i = 0; i < b.length; i++) {
            b[i] = new int[i + 1];
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}