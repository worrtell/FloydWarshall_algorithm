package Floyd;

public class Test {
    public static void main(String[] args) {

    }

    public static double[][] randomNumbers(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][i] = 0;
                }
                else {
                    matrix[i][j] = (int) (Math.random()*1000);
                }
            }

        }
        return matrix;
    }
}
