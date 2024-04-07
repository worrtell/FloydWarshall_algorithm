package Floyd;

public class AlgorithmWithTests {
    static class Iterations {
        int number = 0;
    }

    public static void main(String[] args) {
        Floyd(new double[][]{{1,1,1},{2,2,2},{2,2,2}});
    }
    public static void Floyd(double[][] matrix) {
        Iterations iterations = new Iterations();
        long time;
        long startTime = System.nanoTime();
        ShortestPaths(matrix, iterations);
        long endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println(time + "\t"  + iterations.number);
    }
    public static void ShortestPaths(double[][] matrix, Iterations iterations) {
        int length = matrix.length;
        matrix = InitializeMatrix(matrix);
        for (int k = 0; k < length; k++) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    matrix[i][j] = Math.min(matrix[i][k] + matrix[k][j],matrix[i][j]);
                    iterations.number ++;
                }
            }
        }
    }

    public static double[][] InitializeMatrix(double[][] matrix) {
        int length = matrix.length;
        double inf = Double.POSITIVE_INFINITY;
        double[][] distInf = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i][j] == 0 & (i!=j)) {
                    distInf[i][j] = inf;
                }
                else {
                    distInf[i][j] = matrix[i][j];
                }
            }
        }
        return distInf;
    }
}
