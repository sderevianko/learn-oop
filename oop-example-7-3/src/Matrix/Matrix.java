package Matrix;

public class Matrix {
    final int ARRAY_DIMENSION = 3;
    private int[][] array1;
    private int[][] array2;
    private int[][] array3;
    private int[][] array4;
    private int[][] array5;

    public int[][] getArray1() {
        return array1;
    }

    public int[][] getArray2() {
        return array2;
    }

    public int[][] getArray3() {
        return array3;
    }

    public int[][] getArray4() {
        return array4;
    }

    public int[][] getArray5() {
        return array5;
    }

    public void setArray1(int[][] array1) {
        this.array1 = array1;
    }

    public void setArray2(int[][] array2) {
        this.array2 = array2;
    }

    public void setArray3(int[][] array3) {
        this.array3 = array3;
    }

    public void setArray4(int[][] array4) {
        this.array4 = array4;
    }

    public void setArray5(int[][] array5) {
        this.array5 = array5;
    }

    public void arrayAddition() {
        System.out.println();
        System.out.print("Addition array1 and 2 = array3");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(array3[i][j] = array1[i][j] + array2[i][j]);
                System.out.print(" ");
            }
        }
    }

    public void arrayMultiplyByNumber() {
        System.out.println();
        System.out.print("array 1 multiply by number 5 = array4");
        for (int i = 0; i < ARRAY_DIMENSION; i++) {
            System.out.println();
            for (int j = 0; j < ARRAY_DIMENSION; j++) {
                System.out.print(array4[i][j] = array1[i][j] * 5);
                System.out.print(" ");
            }
        }
    }

    public void arrayMultiplyByArray() {
        for(int i = 0; i < ARRAY_DIMENSION; i++) {
            for(int j = 0; j < ARRAY_DIMENSION; j++) {
                for(int w = 0; w < ARRAY_DIMENSION; w++) {
                    array5[i][j] += array1[i][w] * array2[w][j];
                }
            }
        }
        System.out.println();
        System.out.print("array1 multiply by array2 = array5");
        for(int i = 0; i < ARRAY_DIMENSION; i++) {
            System.out.println();
            for(int j = 0; j < ARRAY_DIMENSION; j++) {
                System.out.print(array5[i][j]);
                System.out.print(" ");
            }
        }
    }
}
