package Floyd;

public class Main2 {
    public static void main(String[] args) {
        for (int i = 10; i < 300; i++) {
            double[][] m = randomNumbers(i);
            ShortestPaths a = new ShortestPaths(m);
            System.out.println(a.time + "\t" + a.iterations);
        }
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
