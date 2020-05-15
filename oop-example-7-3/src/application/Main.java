package application;

import Matrix.Matrix;

public class Main {

    public static void main(String[] args) {


        int [][] array1 = {{1,2,3}, {3,4,5}, {5,6,7}};
        int [][] array2 = {{10,0,17}, {3,4,5}, {111,32,9}};
        int [][] array3 = {{0,0,0}, {0,0,0}, {0,0,0}};
        int [][] array4 = {{0,0,0}, {0,0,0}, {0,0,0}};
        int [][] array5 = {{0,0,0}, {0,0,0}, {0,0,0}};

        Matrix a = new Matrix();
        System.out.print("array1");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(array1[i][j] + " ");
            }
        }
        System.out.println();
        System.out.print("array2");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j]+ " ");
            }
        }
        a.arrayAddition();
        a.arrayMultiplyByNumber();
        a.arrayMultiplyByArray();
    }
}
