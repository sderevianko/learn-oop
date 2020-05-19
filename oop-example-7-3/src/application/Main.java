package application;

import Matrix.Matrix;

public class Main {

    public static void main(String[] args) {

        int[][] arrayFirst = {{1,2,3}, {3,2,1}, {1,2,3}};
        int[][] arraySecond = {{9,8,7}, {7,8,9}, {9,8,7}};
        int[][] arrayNull = {{0,0,0}, {0,0,0}, {0,0,0}};

        Matrix matrix = new Matrix();
        matrix.setArray1(arrayFirst);
        matrix.setArray2(arraySecond);
        matrix.setArray3(arrayNull);
        matrix.setArray4(arrayNull);
        matrix.setArray5(arrayNull);

        matrix.arrayAddition();
        matrix.arrayMultiplyByNumber();
        matrix.arrayMultiplyByArray();
    }
}
