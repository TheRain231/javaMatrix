import java.io.Console;

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
    public Matrix(Matrix matrix) {
        this.matrix = matrix.getMatrix();
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
    public Matrix multiply(Matrix matrix) {
        if (this.matrix.length != this.matrix[0].length) {
            throw new IllegalArgumentException("Matrices does not have the same number of rows and columns");
        }

        Complex[][] newMatrix = new Complex[this.matrix.length][matrix.getMatrix()[0].length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                newMatrix[i][j] = new Complex();
                for (int k = 0; k < this.matrix.length; k++) {
                    newMatrix[i][j] = newMatrix[i][j].add(this.get(i, k).mul(matrix.get(k, j)));
                }
            }
        }
        return new Matrix(newMatrix);
    }
    public Matrix multiply(Complex number) {
        Complex[][] newMatrix = new Complex[this.matrix.length][this.matrix[0].length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                newMatrix[i][j] = this.matrix[i][j].mul(number);
            }
        }
        return new Matrix(newMatrix);
    }

    ///methods
    public Complex determinant(){
        return determinant(this.getMatrix());
    }

    private Complex determinant(Complex[][] matrix) {
        int n = matrix.length;

        if (n == 1) {
            return matrix[0][0];
        }

        if (n == 2) {
            return matrix[0][0].mul(matrix[1][1]).sub(matrix[0][1].mul(matrix[1][0]));
        }

        Complex det = new Complex();
        for (int col = 0; col < n; col++) {
            det = det.add(matrix[0][col].mul(new Complex(Math.pow(-1, col))).mul(determinant(minor(matrix,0, col))));
        }

        return det;
    }

    private Complex[][] minor(Complex[][] matrix, int row, int col) {
        int n = matrix.length;
        Complex[][] minor = new Complex[n - 1][n - 1];

        int minorRow = 0;
        for (int i = 0; i < n; i++) {
            if (i == row) {
                continue;
            }
            int minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) {
                    continue;
                }
                minor[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
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


