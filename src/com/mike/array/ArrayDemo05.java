package com.mike.array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        /*
        二维数组
        [4][2] array[i][j]
        1,2   array[0][j]
        2,3   array[1][j]
        3,4   array[2][j]
        4,5   array[3][j]
         */

        int[][] array = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
//        for (int i = 0; i <array.length ; i++) {
//            System.out.print("{"+array[i][0]+","+array[i][1]+"}"+" ");
//
//        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 1) {
                    System.out.print(array[i][1] + "\n");
                } else {
                    System.out.print(array[i][j] + " ");
                }


            }

        }

    }

}
