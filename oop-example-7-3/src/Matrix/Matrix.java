package Matrix;

public class Matrix {
    public int [][] array1 = {{1,2,3}, {3,4,5}, {5,6,7}};
    public int [][] array2 = {{10,0,17}, {3,4,5}, {111,32,9}};
    public int [][] array3 = {{0,0,0}, {0,0,0}, {0,0,0}};;
    public int [][] array4 = {{0,0,0}, {0,0,0}, {0,0,0}};
    public int [][] array5 = {{0,0,0}, {0,0,0}, {0,0,0}};

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
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(array4[i][j] = array1[i][j] * 5);
                System.out.print(" ");
            }
        }
    }
    public void arrayMultiplyByArray() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                for(int w = 0; w < 3; w++) {
                    array5[i][j] += array1[i][w] * array2[w][j];
                }
            }
        }
        System.out.println();
        System.out.print("array1 multiply by array2 = array5");
        for(int i = 0; i < 3; i++) {
            System.out.println();
            for(int j = 0; j < 3; j++) {
                System.out.print(array5[i][j]);
                System.out.print(" ");
            }
        }
    }
}
