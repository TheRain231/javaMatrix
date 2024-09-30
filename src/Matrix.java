public class Matrix {
    ///variables
    private Complex[][] matrix;

    ///init
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

    ///operations
    public Matrix add(Matrix matrix) {
        Complex[][] newMatrix = new Complex[this.matrix.length][this.matrix[0].length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                newMatrix[i][j] = this.matrix[i][j].add(matrix.get(i, j));
            }
        }
        return new Matrix(newMatrix);
    }
    public Matrix subtract(Matrix matrix) {
        Complex[][] newMatrix = new Complex[this.matrix.length][this.matrix[0].length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                newMatrix[i][j] = this.matrix[i][j].add(matrix.get(i, j).mul(new Complex(-1, 0)));
            }
        }
        return new Matrix(newMatrix);
    }

    ///methods
    public void printMatrix() {
        for (Complex[] complexes : matrix) {
            for (Complex complex : complexes) {
                complex.print();
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    ///get, set
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
}
