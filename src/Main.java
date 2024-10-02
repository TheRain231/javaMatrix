public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Complex[][] m1 = {
                {new Complex(5), new Complex(2), new Complex(-3)},
                {new Complex(3), new Complex(-1), new Complex(4)},
                {new Complex(0), new Complex(2), new Complex(0)}
        };
        matrix1.setMatrix(m1);
        matrix1.printMatrix();
        System.out.print("Determinant: ");
        matrix1.determinant().print();
        System.out.println('\n');

        Matrix matrix2 = new Matrix(2, 2);
        Complex[][] m2 = {
                {new Complex(1, 2), new Complex(8)},
                {new Complex(0, 6), new Complex(2, 3)}
        };
        matrix2.setMatrix(m2);
        matrix2.printMatrix();
        System.out.println("Transposed matrix: ");
        matrix2 = matrix2.transpose();
        matrix2.printMatrix();
        System.out.print("Determinant: ");
        matrix2.determinant().print();
    }
}