package Floyd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter printWriter = new PrintWriter(file);
        for (int n = 10; n < 30; n ++) {
            randomMatrix(n, printWriter);
        }
    }
    public static void randomMatrix(int n, PrintWriter printWriter) {
        printWriter.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    printWriter.println(0);
                }
                else {
                    printWriter.println((int) (Math.random()*1000));
                }
            }
        }
    }
}
