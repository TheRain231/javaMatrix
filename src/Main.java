public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1.set(i, j, new Complex(10, 10));
            }
        }
        matrix1.printMatrix();

        Matrix matrix2= new Matrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2.set(i, j, new Complex(3, 10));
            }
        }
        matrix2.printMatrix();

        matrix1 = matrix1.subtract(matrix2);
        matrix1.printMatrix();

        matrix2 = matrix2.add(matrix1);
        matrix2.printMatrix();
    }
}