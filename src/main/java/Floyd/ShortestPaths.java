package Floyd;

public class ShortestPaths {
    double[][] matrix;
    int length;
    int iterations = 0;
    long time;

    ShortestPaths(double[][] matrix) {
        long startTime = System.nanoTime();
        length = matrix.length;
        matrix = CreateInfMatrix(matrix);
        for (int k = 0; k < length; k++) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    matrix[i][j] = Math.min(matrix[i][k] + matrix[k][j],matrix[i][j]);
                    iterations ++;
                }
            }
        }
        this.matrix = matrix;
        long endTime = System.nanoTime();
        time = endTime - startTime;
    }

    public double[][] CreateInfMatrix(double[][] matrix) {
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

    public void print() {
        double inf = Double.POSITIVE_INFINITY;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i][j] == inf) {
                    System.out.print(" - \t");
                }
                else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
