
public class Matrix {
    private double[][] matrix;
    private int lines;
    private int cols;

    Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.lines = matrix.length;
        this.cols = matrix[0].length;
    }

    private Matrix(int lines, int cols) {
        this(new double[lines][cols]);
    }
    
    Matrix(int size) {
        this(size, size);
    }
}
