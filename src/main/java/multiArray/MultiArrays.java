package multiArray;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

/**
 * Created by RENT on 2017-02-28.
 */
public class MultiArrays {


    public static void main(String[] args) {
        int[][] arrayA = {{1, 3}, {2, 4}};
        int[][] arrayB = {{5, 3}, {6, 4}, {7, 5}};
        int[][] result = multiplyArrays(arrayA, arrayB);
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result[i].length ; j++) {
                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }


//
//        int sizeX = 5;
//        int sizeY = 4;
//
//        int[][] arrayTmp = new int[sizeX][sizeY];
//        int counter = 1;
//        for (int y = 0; y < sizeY; y++) {
//            for (int x = 0; x < sizeX; x++) {
//                arrayTmp[x][y] = sizeX * y + x + 1;
//
//
//            }
//
//
//        }
//        printArray(arrayTmp);
//
//
//        int[] array = new int[10];
//        int[][] array2 = new int[10][];
//        int[][] array3 = new int[][]{{1, 2}, {3, 4}};
//
//        int[] embArr = array3[0];
//        int b = array3[0][0];
//
//        array3[0] = new int[3];
//        array3[0][0] = 6;
//
//        //wypisywanie tablicy
//
//        int[][] array6 = new int[][]{
//                {1, 2, 3},
//                {3, 4, 5},
//                {10, 20, 80}
//        };
//
//        for (int i = 0; i < array6.length; i++) {
//            for (int j = 0; j < array6[i].length; j++) {
//                System.out.print(array6[i][j] + " ");
//
//            }
//            System.out.println();
//
//        }
//
//        for (int i = 0; i < array6.length; i++) {
//            for (int j = 0; j < array6[i].length; j++) {
//                System.out.print(array6[j][i] + " ");
//
//            }
//            System.out.println();
//
//        }
//
//        //TABLICE KOLUMN aa[x], [y]
//        int[][] arrayX = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < arrayX.length; i++) {
//            for (int j = 0; j < arrayX[i].length; j++) {
//                System.out.print(arrayX[j][i]);
//
//            }
//            System.out.println();
//
//        }
//        //zamiana tablicy - trzeba zamienic i z j
//        int[][] change = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < change.length; i++) {
//            for (int j = 0; j < change[i].length; j++) {
//                int x = j;
//                j = i;
//                i = x;
//                System.out.println(change[j][i]);
//
//            }


        // }
        // mnozenie macierzy

//        int[][] arrayA = {{1, 3}, {2, 4}};
//        int[][] arrayB = {{5, 3}, {6, 4}, {7, 5}};

//        int[][] result = multiplyArrays(arrayA, arrayB);
    }

    private static int[][] multiplyArrays(int[][] arrayA, int[][] arrayB) {


        int[][] result = new int[arrayB.length][arrayA[0].length];

        for (int x = 0; x < result.length; x++) {
            for (int y = 0; y < result[0].length; y++) {


                int[] bColumn = arrayB[x];
                int[] aRow = new int[arrayA.length];
                for (int i = 0; i < aRow.length; i++) {
                    aRow[i] = arrayA[i][y];

                }
                int multSum = 0;
                for (int i = 0; i < aRow.length; i++) {
                    int mult = aRow[i] * bColumn[i];
                    multSum += multSum;

                }
                result[x][y] = multSum;

            }

        }
        return result;

    }


}





