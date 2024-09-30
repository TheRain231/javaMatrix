public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Complex[][] m1 = {
                {new Complex(1), new Complex(7), new Complex(3)},
                {new Complex(4), new Complex(-2), new Complex(0)},
                {new Complex(1), new Complex(-5), new Complex(-3)},
        };
        matrix1.setMatrix(m1);
        matrix1.printMatrix();

        Matrix matrix2 = new Matrix(3, 1);
        Complex[][] m2 = {
                {new Complex(-1)},
                {new Complex(2)},
                {new Complex(7)}
        };
        matrix2.setMatrix(m2);
        matrix2.printMatrix();

        Matrix matrix3 = new Matrix(matrix1.multiply(matrix2));
        matrix3 = matrix3.multiply(new Complex((double) 1/2));
        matrix3.printMatrix();
    }
}