public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Complex[][] m1 = {
                {new Complex(5), new Complex(2), new Complex(-3)},
                {new Complex(3), new Complex(-1), new Complex(4)},
                {new Complex(0), new Complex(2), new Complex(0)}
        };
        matrix1.setMatrix(m1);
        System.out.println("matrix1");
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
        System.out.println("matrix2");
        matrix2.printMatrix();
        System.out.println("Transposed matrix: ");
        matrix2 = matrix2.transpose();
        matrix2.printMatrix();
        System.out.print("Determinant: ");
        matrix2.determinant().print();
        System.out.println('\n');

        Complex[][] m3 = {
                {new Complex(2), new Complex(5), new Complex(7)},
                {new Complex(6), new Complex(3), new Complex(4)},
                {new Complex(5), new Complex(-2), new Complex(-3)}
        };
        Matrix matrix3 = new Matrix(m3);
        System.out.println("matrix3");
        matrix3.printMatrix();
        matrix3 = matrix3.inverse();
        System.out.println("Inversed matrix: ");
        matrix3.printMatrix();
        System.out.println("\nDivision of matrix1 and inversed matrix3");
        matrix1.divide(matrix3).printMatrix();
    }
}