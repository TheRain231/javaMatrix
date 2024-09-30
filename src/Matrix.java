public class Matrix {
    private Complex[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new Complex[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = new Complex(1, 2);
            }
        }
    }
    public Matrix(Complex[][] matrix) {
        this.matrix = matrix;
    }

    public Complex[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(Complex[][] matrix) {
        this.matrix = matrix;
    }

    public Complex get(int i, int j) {
        return matrix[i][j];
    }
    public void set(int i, int j, Complex z) {
        matrix[i][j] = z;
    }

    public void printMatrix() {
        for (Complex[] complexes : matrix) {
            for (Complex complex : complexes) {
                complex.print();
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
