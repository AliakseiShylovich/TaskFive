public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0, 0}, {1, 0, 0, 0}, {1, 2, 0, 0}, {1, 2, 3, 0}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (matrix.length == matrix[i].length) {
                    if (matrix[i][j] != 0) {
                        System.out.println("Матрица не является нижней треугольной");
                        return;
                    }
                } else {
                    System.out.println("Матрица не является нижней треугольной");
                    return;
                }
            }
        }
        System.out.println("матрица является нижней треугольной");
    }
}
