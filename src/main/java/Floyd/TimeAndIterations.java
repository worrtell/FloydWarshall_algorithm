package Floyd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimeAndIterations {
    public static void main(String[] args) throws FileNotFoundException {
        double[][][] test = readMatrix();
        for (int i = 0; i < 15; i++) {
            AlgorithmWithTests.Floyd(test[i]);
        }
    }

    public static double[][][] readMatrix() throws FileNotFoundException {
        File file = new File("testFile");
        Scanner scanner = new Scanner(file);
        double[][][] test = new double[15][][];
        int cnt = 0;
        int n;
        for (int i = 10; i < 25; i++) {
            n = Integer.parseInt(scanner.nextLine());
            double[][] matrix = new double[n][n];
            for (int p = 0; p < n; p++) {
                for (int q = 0; q < n; q++) {
                    matrix[p][q] = Double.parseDouble(scanner.nextLine());
                }
            }
            test[cnt] = matrix;
            cnt++;
        }
        return test;
    }
}
